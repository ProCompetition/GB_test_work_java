import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.printf("Write your number N: ");
        Scanner num = new Scanner(System.in);
        int N = num.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.printf("The sum of the number from 1 to %d = %d%n", N, sum);
        num.close();
    }
}