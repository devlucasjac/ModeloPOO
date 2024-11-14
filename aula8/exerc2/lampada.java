package aula8.exerc2;

public class lampada {
    private boolean status;   

    public lampada(boolean status){
        this.status=status;                
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public void ligar(){
        setStatus( true);
    }
    public void desligar(){
        setStatus( false);
    }

    public String observar(){
        return getStatus() ? "Ligado" : "Desligado";
    }
}
