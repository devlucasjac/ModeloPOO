package aula8.exerc2;

public class lampadaTest {
    public static void main(String[] args){
        lampada lamp1 = new lampada(false);
        lampada lamp2 = new lampada(false);

        System.out.println("Estado lamp1: " + lamp1.observar());
        lamp1.ligar();
        System.out.println("Estado lamp1: "+ lamp1.observar());
        lamp1.desligar();
        System.out.println("Estado lamp1: " + lamp1.observar());

        System.out.println("Estado lamp2: " + lamp2.observar());
        lamp2.ligar();
        System.out.println("Estado lamp2: "+ lamp2.observar());
        lamp2.desligar();
        System.out.println("Estado lamp2: " + lamp2.observar());

    }
}
