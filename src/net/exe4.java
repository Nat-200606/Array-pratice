package net;

public class exe4 {
    public static void multVetor(){
        double[] n1 = {2,4,6,8,10,12,14,16,18,20};
        double[] n2 = {1,3,5,7,9,11,13,15,17,19};
        double[] d = new double[10];
        int[] m = new int[10];

        System.out.printf("Valores do primero vetor: ");
        for (int x=0; x<10; x++){
            System.out.printf((int)n1[x]+",");
        }
        System.out.println();

        System.out.printf("Valores do segundo vetor: ");
        for (int x=0; x<10; x++){
            System.out.printf((int)n2[x]+",");
            d[x] = (n1[x]/n2[x]);
            m[x] = (int) (n1[x]*n2[x]);
        }
        System.out.println();

        System.out.printf("Valores da divissao: ");
        for (int x=0; x<10; x++){
            System.out.printf(d[x]+",");
        }
        System.out.println();

        System.out.printf("Valores da multiplicacao: ");
        for (int x=0; x<10; x++){
            System.out.printf(m[x]+",");
        }
    }
}
