package aula4;

import java.util.Scanner;

public class SwitchAula {
    public static void main(String args[]){
        String dia;     
        int num;

        System.out.println("Insira um valor entre 1 e 7:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        switch(num){
            case 1: dia = "domingo";
                break;
            case 2: dia = "segunda";
                break;
            case 3: dia = "terça";
                break;
            case 4: dia = "quarta";
                break;
            case 5: dia = "quinta";
                break;
            case 6: dia = "sexta";
                break;
            case 7: dia = "sabado";
                break;
            default: dia = "Valor inválido";
        }
        
        System.out.println("Hoje é:" + dia);
        System.out.println();

    }
}
