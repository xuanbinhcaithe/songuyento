import java.util.Scanner;

public class HenThiCacHinh {
    public static void main(String[] args) {
        System.out.println("1.rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    System.out.println("1.botton_left");
                    System.out.println("2.left_top");
                     int choice1 = scanner.nextInt();
                     switch (choice1) {
                         case 1:
                             botton_left();
                             break;
                         case 2:
                             left_top();
                             break;
                         default:
                             System.out.println("no choice!");
                     }
                     break;
                case 3:
                    System.exit(0);

                    }
            }
    }

    public static void rectangle(){
        for (int i = 1;i <= 5;i++) {
            for (int j = 1;j <= 7;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void botton_left() {
        for (int i = 1;i<=5;i++) {
            for (int j = 1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void left_top() {
        for (int i = 1;i<=5;i++) {
            for (int j = 5;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
