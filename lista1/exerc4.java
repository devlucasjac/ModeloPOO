package lista1;

import java.util.Scanner;

public class exerc4 {
    
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        String nome;
        float nota1,nota2,nota3,media;
        System.out.println("Digite o nome do aluno:");
        nome = sc.nextLine();
        System.out.println("Digite o valor da nota1:");
        nota1=sc.nextFloat();
        System.out.println("Digite o valor da nota2:");
        nota2=sc.nextFloat();
        media = (nota1+nota2)/2;
        if(media >= 6.0){
            System.out.printf("Aluno %s Aprovado\n",nome);
        }else{
            if(media >= 4.0){
                System.out.printf("Aluno %s em AF\n",nome);
                System.out.println("Digite a nota da AVF:");
                nota3=sc.nextFloat();
                media = (media+nota3)/2;
                if(media>=6){
                    System.out.printf("Aluno %s Aprovado\n",nome);
                }else{
                    System.out.printf("Aluno %s Reprovado\n",nome);
                }
            }else{
                System.out.printf("Aluno %s Reprovado\n",nome);
            }            
        }
        sc.close();
        
        
    }
}
