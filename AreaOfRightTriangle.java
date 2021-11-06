import java.util.Scanner;

public class AreaOfRightTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = input.nextInt();
        System.out.println("Enter the second value: ");
        int b = input.nextInt();


        System.out.println("Area of right triangle: " + (a * b) / 2);
    }
}
