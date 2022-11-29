import  java.util.Scanner;

public class TwoNumCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first numbers: ");
        int a = sc.nextInt();

        System.out.println("Enter second numbers: ");
        int b = sc.nextInt();

//        comparison
        if (a > b){
            System.out.println("Your first number is big. " + a + " > " + b);
        }

        else if (a < b) {
            System.out.println("Your Second number is big. " + b + " > " + a);
        }

        else {
            System.out.println("Both number are equal");
        }


    }
}
