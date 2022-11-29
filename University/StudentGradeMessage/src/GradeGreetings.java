import java.util.Scanner;

public class GradeGreetings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Grade :");

        char grade = sc.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Amazing Work");
                break;

            case 'B':
                System.out.println("Good job");
                break;

            case 'C':
                System.out.println("Nice Work");
                break;
            case 'D':
                System.out.println("Not bad");
                break;

            case 'E':
                System.out.println("Better luck next time");
                break;

            case 'F':
                System.out.println("Bad");
                break;

            default:
                System.out.println("Enter Between A to F");
                break;
        }




    }
}
