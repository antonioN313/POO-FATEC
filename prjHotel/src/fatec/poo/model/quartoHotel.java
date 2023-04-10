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
    }
    
    public void reservar(int numRG)
    {
        this.situacao = true;
    }
    
    public double liberar(int dias)
    {
        
    }
}
