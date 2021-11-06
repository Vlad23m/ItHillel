import java.util.Scanner;

class Temprature2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        double tC = input.nextDouble();
        double tK;
        System.out.println("Temperature in degrees Kelvin: " + (tC + 273.15));


    }
}