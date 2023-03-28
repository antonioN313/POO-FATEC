package fatec.poo.model;

public class Cliente extends Pessoa {
    private String cpf;
    private double peso;
    private double altura;

    public Cliente(String cpf,String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcIMC(double altura,double peso)
    {
        double IMC;
        IMC = this.peso/Math.pow(this.altura,2);
        return IMC;
    }
}
