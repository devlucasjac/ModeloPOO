package lista1;

import java.util.Scanner;

public class exerc3 {
    
    public static void main(String args[]){
        float l,c,w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de l:");
        l = sc.nextFloat();
        System.out.println("Digite o valor de c:");
        c = sc.nextFloat();
        sc.close();

        w=(l*c)*18;
        System.out.printf("A potencia nescessária é de %.2fW\n",w);
    }

}
