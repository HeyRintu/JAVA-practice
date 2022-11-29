import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the Ending Number: ");
        int end = sc.nextInt();

        System.out.println("Enter 1 for find ODD numbers and Enter 2 for find EVEN numbers : ");
        int choose = sc.nextInt();

        for (int initial = 1; initial < end; initial++) {



            switch (choose) {
                case 1:
                    if (initial % 2 == 0) {
                        System.out.println("The ODD numbers are: " + initial);
                    }
                    break;
                case 2:
                    if (initial % 2 != 0) {
                        System.out.println("The EVEN numbers are: " + initial);
                    }
                    break;

                default:
                    System.out.println("Enter number 1 or 2");
                    break;
            }


        }
    }
}