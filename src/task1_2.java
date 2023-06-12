 import java.util.ArrayList;
 import java.util.List;
 import java.util.Scanner;

 public class task1_2 {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Write your number N: ");
         int input = scanner.nextInt();
         scanner.close();
         List<Integer> primes = new ArrayList<>();

         for (int i = 2; i <= input; i++) {
             boolean isPrimeNumber = true;

             for (int j = 2; j < i; j++) {
                 if (i % j == 0) {
                     isPrimeNumber = false;
                     break;
                 }
             }

             if (isPrimeNumber) {
                 primes.add(i);
             }
         }
         System.out.println("Prime numbers: " + primes);
     }
 }