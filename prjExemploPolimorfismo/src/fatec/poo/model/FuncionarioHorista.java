package fatec.poo.model;
public class FuncionarioHorista  extends Funcionario{
    
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao,double valHorTrab, int qtdeHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    @Override
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return (calcSalBruto() * 0.075);
    }

    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto() + calcGratificacao());
    }
}
