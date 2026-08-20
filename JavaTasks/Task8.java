import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + n + " is " + sum);
        input.close();
    }
}
