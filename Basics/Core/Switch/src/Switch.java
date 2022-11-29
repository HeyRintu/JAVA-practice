import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Experience Rating: ");
        int rating = sc.nextInt();

        switch (rating){
            case 1:
                System.out.println("very bad rating, 1 ");
                break;
            case 2:
                System.out.println("Bad rating, 2");
                break;
            case 3:
                System.out.println("not so bad, 3");
                break;
            case 4:
                System.out.println("Good, 4 ");
                break;
            case 5:
                System.out.println("very good, 5");
                break;
            default:
                System.out.println("enter rating between 1 to 5");
        }


    }
}
