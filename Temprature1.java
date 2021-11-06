import java.util.Scanner;

public class Temprature1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");
        double tF = input.nextDouble();
        double tC;
        System.out.println("Temperature in degrees Celsius: " + (tF -32) * 5 / 9);


    }
}
