import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("nhap vao so tien usd");
        usd = scanner.nextDouble();
        System.out.println("so tien vnd tuong ung la "+ usd*vnd);
    }
}
