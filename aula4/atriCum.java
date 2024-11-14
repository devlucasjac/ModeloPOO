package aula4;

import java.util.Scanner;

public class atriCum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        sc.close();

        double conta = 50.0;

        conta += (min > 100) ? (min -100)*2.0:0;

        System.out.printf("Valor da conta = R$ %.2f \n", conta);
    }
}
