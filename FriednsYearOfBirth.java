import java.util.Scanner;

//public class FriednsYearOfBirth {
    //public static void main(String[] args) {

   //     int now = 3126;
    //    int wasborn = 8;

    //    System.out.println(now - wasborn);

   // }
//}

public class FriednsYearOfBirth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many years ago was your friend born?");
        int wasborn = input.nextInt();
        System.out.println("What is the year now?");
        int now = input.nextInt();


        System.out.println("Your friend was born in " + (now - wasborn));

    }
}
