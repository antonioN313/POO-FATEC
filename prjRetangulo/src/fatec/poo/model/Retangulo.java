package fatec.poo.model;

public class Retangulo {
    
    private double Altura;
    private double Base;
    
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public double getBase() {
        return Base;
    }
    
    public double calcArea(){
        return(getAltura() * getBase());
    }
    
    public double calcPerimetro(){
        return(2 *(getBase() + getAltura()));
    }
}
