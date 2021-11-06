import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double minutesInYear = 60 * 24 * 365;
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of minutes: ");
        double min = input.nextDouble();
        long years = (long) (min / minutesInYear);
        int days = (int) ((min / 60 / 24) % 365);
        System.out.println( (int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
