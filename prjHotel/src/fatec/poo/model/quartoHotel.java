package fatec.poo.model;
public class quartoHotel {
    
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;

    public quartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        this.numRG = 0;
        this.situacao = false;
    }
    
    public void reservar(int numRG)
    {
        this.numRG = numRG;
        this.situacao = true;
    }
    
    public double liberar(int dias)
    {
        totalFaturado += (valorDiaria * dias);
        this.numRG = 0;
        situacao = false;
        return(valorDiaria * dias);
    }

    public boolean isSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
    public double getNumQuarto()
    {
        return numQuarto;
    }
    
}
