import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        input.close();
    }
}
