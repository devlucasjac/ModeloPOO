package aula8.exerc1;

public class rectangleTest {
    public static void main(String[] args) {
        rectangle retangulo = new rectangle(3.00, 4.00);

        System.out.println("Area " + retangulo.area());
        System.out.println("Perimetro " + retangulo.perimetro());
        System.out.println("Diagonal " + retangulo.diagonal());
    }
}
