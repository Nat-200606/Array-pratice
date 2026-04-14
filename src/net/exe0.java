package net;

import java.util.Scanner;

public class exe0 {
    public static void SomaPar()
    {
        System.out.println("vamos escrever 10 numeros e somar os numeros pares dentre eles");

        Scanner input = new Scanner(System.in);
        int n[] = new int[10];
        int soma = 0;

        for (int x = 0; x < 10; x++) {
            System.out.println("Escreva  o " + (x + 1) + " numero");
            n[x] = input.nextInt();
            if (n[x] % 2 == 0) {
                soma += n[x];
            }
        }

        System.out.println("A soma dos pares e igual a " + soma);
    }
}
