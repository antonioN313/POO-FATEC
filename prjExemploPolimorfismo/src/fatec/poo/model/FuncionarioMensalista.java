package fatec.poo.model;
public class FuncionarioMensalista extends Funcionario {

    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista(int registro, String nome, String dtAdmissao,double valSalMin, double numSalMin) {
        super(registro, nome, dtAdmissao);
        this.valSalMin = valSalMin;
        this.numSalMin = numSalMin;
    }
    
    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }

    @Override
    public double calcSalBruto() {
        return(valSalMin * numSalMin);
    }
    
    
    
}
