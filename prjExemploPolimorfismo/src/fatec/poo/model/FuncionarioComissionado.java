package fatec.poo.model;
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao,double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }
    
    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    public double getSalBase() {
        return salBase;
    }
   

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public double getTaxaComissao() {
        return (taxaComissao * 100);
    }
    
    public double addVendas(double venda){
        return totalVendas += venda;
    }

    public double calcSalBruto() {
       return(getSalBase() + getTaxaComissao() * getTotalVendas());
    }
    
    public double calcGratificacao(){
        if(getTotalVendas() > 5000 && getTotalVendas() <= 10000)
        {
           return(calcSalBruto() * 0.03);
        }
        else if (getTotalVendas() > 10000){
            return(calcSalBruto() * 0.05);
        }
        return(0);
    }
}
