
package com.mycompany.projetosestagio;

import java.util.Scanner;

public class InverterString {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe a string
        System.out.print("Informe uma string: ");
        String original = scanner.nextLine();

        // Inicializa uma string vazia para armazenar a string invertida
        String invertida = "";

        // Percorre a string original de trás para frente e constrói a string invertida
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        // Exibe a string invertida
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}
