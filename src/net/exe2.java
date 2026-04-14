package net;

import java.util.Scanner;

public class exe2 {
    public static void ListNotas(int nNotas){
        Scanner input = new Scanner(System.in);
        int[] nota = new int[nNotas];
        int[] abaixo = new int[nNotas];
        int media = 0;
        for (int x = 0; x < nNotas; x++){
            System.out.println("Insira a "+(x+1)+" nota");
            nota[x] = input.nextInt();
            media+=nota[x];
        }
        media = media/nNotas;

        for (int x = 0; x < nNotas; x++){
            if (nota[x] < media){
                abaixo[x] = 1;
            }else {
                abaixo[x] = 0;
            }
        }

        System.out.println("A media e de "+media);

        for (int x = 0; x < nNotas; x++) {
            switch (abaixo[x]) {
                case 1:
                    System.out.println("O aluno " + (x + 1) + " ficou abaixo da media com uma nota de " + nota[x]);
                    break;
                case 0:
                    System.out.println("O aluno " + (x + 1) + " ficou acima da media com uma nota de " + nota[x]);
                    break;
            }
        }
    }
}
