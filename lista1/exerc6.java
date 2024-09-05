package lista1;

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args){
        double a,b,c,delta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de a:");
        a = sc.nextFloat();
        System.out.println("Insira o valor de b:");
        b = sc.nextFloat();
        System.out.println("Insira o valor de c:");
        c = sc.nextFloat();
        sc.close();
        delta=Math.pow(b,2) - (4*a*c);

        if(delta<0){
            System.out.println("Não existe solução real.");
        }else if(delta ==0){
            System.out.printf("A solução é: %.2f",((-1*b)/2*a));
        }else{
            System.out.printf("O valor de x1 é %.2f",(((-1*b)+Math.sqrt(delta))/2*a));
            System.out.printf("O valor de x2 é %.2f",(((-1*b)-Math.sqrt(delta))/2*a));
        }


    }
}
