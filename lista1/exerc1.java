package lista1;

import java.util.Scanner;

public class exerc1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float A,B,X;
        System.out.println("Digite o valor de A:\n");
        A = sc.nextFloat();
        System.out.println("Digite o valor de B:\n");
        B = sc.nextFloat();
        sc.close();

        X = (A+B)/(A-B);
        System.out.printf("O valor da expressão X é: %.2f\n",X);
    }
}
