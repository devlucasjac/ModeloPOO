package classes;

import java.util.Scanner;

public class triangleTester {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        triangle X = new triangle();
        triangle Y = new triangle();
        
        System.out.println("Medidas do triangulo x:");

        X.a=sc.nextDouble();
        X.b=sc.nextDouble();        
        X.c=sc.nextDouble();

        System.out.println("Medidas do triangulo y:");

        Y.a=sc.nextDouble();
        Y.b=sc.nextDouble();
        Y.c=sc.nextDouble();

        sc.close();

        if(Y.area()> X.area()){
            System.out.printf("Medida Y: %2f",Y.area());
        }else{
            System.out.printf("Medida X:%2f",X.area());
        }

    }
}
