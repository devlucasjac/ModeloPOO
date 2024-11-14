package aula5;

public class exerc3 {
    public static void main(String args[]){
        double chico= 1.50,juca=1.1;
        int anos=0;

        while(juca < chico){
            chico+=0.02;
            juca+=0.03;
            anos++;
        }
      
        System.out.printf("Levara %d anos para juca ser maior que chico \n Juca: %f\n Chico: %f\n",anos,juca,chico);
    }
}
