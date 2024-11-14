package aula8;

public class galinhaTeste {
    public static void main(String[] args) {
        galinha pintadinha = new galinha();
        galinha carijo = new galinha();

        carijo.botar();
        carijo.botar();
        carijo.botar();
        carijo.botar();

        pintadinha.botar();
        pintadinha.botar();
        pintadinha.botar();

        System.out.println("Carijo botou " + carijo.ovos + " ovos.");
        System.out.println("Pintadinha botou " + pintadinha.ovos + " ovos.");

        System.out.println("As galinhas da granja botaram " + galinha.ovosDaGranja + " ovos.");

        System.out.println("A média das galinhas da granja foi de " + galinha.mediaDeOvos(2) + " ovos.");

    }
}