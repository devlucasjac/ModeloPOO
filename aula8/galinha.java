package aula8;

public class galinha {
    public static int ovosDaGranja;

    public int ovos;

    public void botar(){
        this.ovos++;

        galinha.ovosDaGranja++;        
    }

    public static double mediaDeOvos(int galinhas){
        return galinha.ovosDaGranja/(double)galinhas;
    }
}
