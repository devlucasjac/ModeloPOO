package aula8.exerc1;



public class rectangle {
    private double width;
    private double height;

    public rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;        
    }

    public double perimetro(){
        return 2*(width+height);        
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
    }
}
