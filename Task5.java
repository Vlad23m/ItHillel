public class Task5 {
    public static void main(String[] args) {

        int num1 = 1000;
        int num2 = 10000;

        int randomnumber = (int)(Math.random() * (num2 - num1) + 1);
        System.out.println(randomnumber);
    }
}
