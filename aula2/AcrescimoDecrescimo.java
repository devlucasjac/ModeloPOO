package aula2;

public class AcrescimoDecrescimo {
    
    public static void main(String[] args){
        int count = 15;
        int a,b,c,d;
        a=count++;
        b=count;
        c=++count;
        d=count;
        System.out.printf("Valor de a: %d, valor de b: %d.\n",a,b);
        System.out.printf("Valor de c: %d, valor de d: %d.\n",c,d);
    }

}
