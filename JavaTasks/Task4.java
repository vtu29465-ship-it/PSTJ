import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {

            factorial *= i;
            while (factorial < 0) {
                System.out.println("Factorial is too large to compute.");
                
            }
        }
        System.out.println("Factorial of " + n + " is " + factorial);
        input.close();
    }
}
