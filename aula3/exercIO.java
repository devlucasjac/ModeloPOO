package aula3;

import java.util.Locale;

public class exercIO {
    public static void main(String[] args) {
        String produto1= "Computador Desktop";
        String produto2 = "Notebook";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 8650.50;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, cujo preço é R$ %.2f\n",produto1,preco1);
        System.out.printf("%s, cujo preço é R$ %.2f\n\n",produto2, preco2);
        System.out.printf("Registro: %d anos de idade, codigo %d e genero %c \n\n",idade,codigo,genero);
        System.out.printf("Medida com 8 casas decimais: %.8f\n",medida);
        System.out.printf("Arredontamento (três casas decimais): %.3f\n",medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal americano: %.3f\n",medida);
    }

}
