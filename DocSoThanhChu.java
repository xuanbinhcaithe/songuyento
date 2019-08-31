import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bất ký");
        int number = scanner.nextInt();
        if (number < 10) {
            System.out.println(soMotChuSo(number));
        }else if (number <=99) {
            System.out.println(soHaiChuSo(number));
        }else if (number<=999) {
            System.out.println(soBaChuSo(number));
        }else {
            System.out.println("vui lòng nhập lại số từ 1 --> 999");
        }


    }

    public static String soMotChuSo (int number){
        String str = "";
        switch (number) {
            case 1:
                str = "một";
                break;
            case 2:
                str = "hai";
                break;
            case 3:
                str = "ba";
                break;
            case 4:
                str = "bốn";
                break;
            case 5:
                str = "năm";
                break;
            case 6:
                str = "sáu";
                break;
            case 7:
                str = "bảy";
                break;
            case 8:
                str = "tám";
                break;
            case 9:
                str = "chín";
                break;
        }
        return str;
    }


    public static String soHaiChuSo (int number) {
        String str = "";
        int hangChuc = number / 10;
        int hangDonVi = number % 10;
        if (number == 10) {
            str = " mười ";
        } else {
            str = soMotChuSo(hangChuc) + " mươi " + soMotChuSo(hangDonVi);
        }
        return str;
    }

    public static  String soBaChuSo (int number) {
        String str = "";
        int hangTram = number/100;
        int hangChuc = number%100;
        int hangDonVi = hangChuc%10;
        if (number%100 == 0) {
            str = soMotChuSo(hangTram) + " trăm ";
        }else {
        str = soMotChuSo(hangTram) +" trăm "+ soHaiChuSo(hangChuc);
    }
        return str;

    }



}
