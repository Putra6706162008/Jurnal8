import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Masukan Jumlah Deret Fibonacci: ");
        int number = new Scanner(System.in).nextInt();
        fibonacciLoop(number);
    }

    public static int fibonacciLoop(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        int sum = 2;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            sum = sum + fibonacci;
        }
        System.out.println("Jumlah total input deret fibonacci: " +sum);
        return fibonacci; // Fibonacci number
    }
}
