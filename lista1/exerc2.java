package lista1;


import java.util.Scanner;

public class exerc2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double raio,volume,area;

        System.out.println("Digite o valor do raio:");
        raio=sc.nextDouble();
        sc.close();
        area=4*Math.PI*(raio*raio);
        volume=4.0/3.0*Math.PI*Math.pow(raio,3);
        System.out.printf("Area do circulo: %.2f\n",area);
        System.out.printf("Volume da esfera: %.2f\n",volume);
    }
}
