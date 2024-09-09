package lista1;

import java.util.Scanner;

public class exerc5 {
    public static void main(String args[]){
        float p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do preço:");
        p = sc.nextFloat();
        sc.close();

        if(p<=50){
            p+=(p * 0.05);
        }else if(p>50 && p <=100){
            p+=(p * 0.1);
        }else{
            p+=(p * 0.15);
        }

        if(p<=80){
            System.out.printf("Preço :%.2f\n Barato.",p);
        }else if(p>80 && p<=120){
            System.out.printf("Preço :%.2f\n Normal.",p);
        }else if(p>120 && p<=200){
            System.out.printf("Preço :%.2f\n Caro.",p);
        }else{
            System.out.printf("Preço :%.2f\n Muito caro.",p);
        }
    }
}
