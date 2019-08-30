import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố");
        int number = scanner.nextInt();
        int count =0;
        for (int i = 1;;i++) {
            if (check(i)) {
                count++;
                System.out.println("số nguyên tố thứ "+count+" là "+i);
            }
            if (count == number) break;
        }
    }

    public static boolean check (int number) {
        boolean soNguyenTo = true;

        if (number < 2) {
            soNguyenTo = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    soNguyenTo = false;
                    break;
                }
                i++;
            }
        }
        return soNguyenTo;
    }
}
