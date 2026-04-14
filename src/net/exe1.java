package net;

import java.util.Scanner;

public class exe1 {
    public static void MaiorMenorNota(int nNotas) {
        Scanner input = new Scanner(System.in);
        int[] nota = new int[nNotas];
        int[] maior = new int[2];
        int[] menor = new int[2];

        for (int x = 0; x < nNotas; x++){
            System.out.println("Insira a "+(x+1)+" nota");
            nota[x] = input.nextInt();
        }

        int x = 0;
        int y = 0;

        while (true){
            if (nota[x] >= nota[y]){
                if (y == (nNotas-1)){
                    maior[0] = nota[x];
                    maior[1] = (x+1);
                    break;
                }
                y++;
            }else{
                x++;
                y = 0;
            }
        }

     x = 0;
     y = 0;

        while (true){
        if (nota[x] <= nota[y]){
            if (y == (nNotas-1)){
                menor[0] = nota[x];
                menor[1] = (x+1);
                break;
            }
            y++;
        }else{
            x++;
            y = 0;
        }
    }

        System.out.println("A maior nota e "+maior[0]+" do aluno "+maior[1]);
        System.out.println("A menor nota e "+menor[0]+" do aluno "+menor[1]);
}
}
