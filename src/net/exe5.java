package net;

import java.util.Scanner;

public class exe5 {
    public static void positivar(int nValores){
        int[] n = new int[nValores];
        Scanner input = new Scanner(System.in);
        int y = 0;

        System.out.println("Numeros negativos se tornarao 0");
        for (int  x = 0; x < nValores; x++){
            System.out.println("digite o "+x+" numero");
            y = input.nextInt();
            if (y >= 0){
                n[x] = y;
            }else {
                n[x] = 0;
            }
        }
        System.out.println();
        System.out.printf("nova matriz:");
        for (int  x = 0; x < nValores; x++){
            System.out.printf(n[x]+",");
        }
    }
}
