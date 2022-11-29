import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Temperature in fahrenheit : ");
        int fahr = sc.nextInt();

        float cels = (((fahr - 32) * 5) / 9f);

        System.out.println("The temperature in Celsius is : " + cels);



    }

}



