
package fatec.poo.model;

public abstract class Pessoa {
    
    private String nome;
    private int anoInscricao;
    private double totalCompras;

    public Pessoa(String nome, int anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
    }
    
    abstract public double calcBonus();
    
    public double calcBonus(int anoAtual){
        return(anoAtual - getAnoInscricao());
    }
    
    public void addCompras(double totalCompras)
    {
        this.totalCompras += totalCompras;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    
}
