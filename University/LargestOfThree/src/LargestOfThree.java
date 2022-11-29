import java.util.Scanner;
public class LargestOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        int a = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Third Number");
        int c = sc.nextInt();

        if ( a>b && a>c){
            System.out.println("The biggest Number is : " + a);
        }
        if (b>c && b>a) {
            System.out.println("The biggest Number is : " + b);
        }
        if (c>a && c>b) {
            System.out.println("The biggest Number is : " + c);
        }
        if( a == b & b == c){
            System.out.println("All numbers are Equal");
        }


    }
}
