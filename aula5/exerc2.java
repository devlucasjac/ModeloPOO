package aula5;

public class exerc2 {
    public static void main(String args[]){
        float p1,p2;
        for(int i = 1000;i<=9999;i++){
            p1=i/100;
            p2=i%100;
            if((p1+p2)*(p1+p2)==i){
                System.out.printf("O valor do algarismo é: %d\n",i);
            }
        }

    }
    
}
