import java.util.Scanner;

public class new1 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the end number: ");
            int num2 = scanner.nextInt();

            int randomnumber = num1 + (int)(Math.random() * ((num2 - num1) + 1));
            System.out.println(randomnumber);

    }
}
