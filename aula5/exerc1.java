package aula5;

import java.util.Scanner;

public class exerc1 {    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero de referencia:");
        int ref =sc.nextInt(),num, mult=1;

        for(int i=0;i<10;i++){
            System.out.println("Digite um numero inteiro.");
            num = sc.nextInt();
            if(num >= ref && num %2 ==0 && num%5==0){
                mult*=num;
            }
        }
        sc.close();
        System.out.printf("O valor da mult: %.2f",mult);
    }

}
