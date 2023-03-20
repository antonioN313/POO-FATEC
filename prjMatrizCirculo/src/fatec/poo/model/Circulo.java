package fatec.poo.model;

public class Circulo {

    private double Raio;
    private String medida;
    
    public Circulo(String uniMed)
    {
        medida = uniMed;
    }
    public double getRaio() {
        return Raio;
    }
    
    public String getMedida() {
        return medida;
    }

    public void setRaio(double Raio) {
        this.Raio = Raio;
    }
    public double calcArea(){
        return (3.1416 * Math.pow(Raio, 2));
    }
    public double calcPerimetro(){
        return 2*3.1416*Raio;
    }
    public double calcDiametro(){
        return 2*Raio;
    }
}
