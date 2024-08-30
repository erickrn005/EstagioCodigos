
package com.mycompany.projetosestagio;
import java.util.Scanner;
public class VerificadorFibonacci {
      public static boolean ehFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        int primeiro = 0;
        int segundo = 1;
        int proximo = primeiro + segundo;

        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            primeiro = segundo;
            segundo = proximo;
            proximo = primeiro + segundo;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (ehFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
