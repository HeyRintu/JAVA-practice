//TODO: take input from user and add two number

import java.util.Scanner;


public class AddTwoNumsUsers {
    public static void main(String[] args) {

//        declear veriables
        int firstNum, secondNum, result;


        Scanner input = new Scanner(System.in);

//        TAKE INPUT FROM USER
        System.out.println("Enter number one : ");
        firstNum = input.nextInt();

        System.out.println("Enter number two : ");
        secondNum = input.nextInt();

        result = firstNum + secondNum;
        System.out.println("Your added value is: " + result);

    }
}
