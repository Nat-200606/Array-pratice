package net;

import java.util.Scanner;

public class exe3 {
    public static void lerVetor(){
        int[] n = {2,4,6,8,10,12,14,16,18,20};
        int pos = -1;
        int x = 0;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Insira um numero para ver compatibilidade");

            if (input.hasNextInt()){
                x = input.nextInt();
            }else if (input.hasNextLine()){
                break;
            }

            for (int y = 0; y < 10; y++){
                if (x == n[y]){
                    pos = y;
                }
            }

            if (pos ==  -1){
                System.out.println("numero incompativel");
            }else {
                System.out.println("O numero "+x+" foi localizado na posicao "+pos);
            }
            System.out.println("deseja inserir outro numero?[y/n]");
            if (input.next().equals("y")){
                    pos = -1;
            }else {
                break;
            }

        }
    }
}
