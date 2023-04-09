package fatec.poo.model;
public class PessoaJuridica extends Pessoa{
    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String nome,String cgc, int anoInscricao) {
        super(nome, anoInscricao);
        this.cgc = cgc;
        
    }

    @Override
    public double calcBonus() {
        return(calcBonus() * getTotalCompras() * getTaxaIncentivo());
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }
    
    

    public String getCgc() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }
    
}
