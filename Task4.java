import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float  timeSeconds;
        float  mps, kph;

        System.out.println("Input distance in meters: ");
        float distance = input.nextFloat();
        System.out.println("Input hour: ");
        float hour = input.nextFloat();
        System.out.println("Input minutes: ");
        float minutes = input.nextFloat();
        System.out.println("Input seconds: ");
        float seconds = input.nextFloat();

        timeSeconds = (hour*3600) + (minutes*60) + seconds;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );

        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kph);

    }
}
