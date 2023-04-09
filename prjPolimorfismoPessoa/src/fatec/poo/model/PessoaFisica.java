package fatec.poo.model;
public class PessoaFisica extends Pessoa {
    private String cpf;
    private double base;

    public PessoaFisica(String nome,String cpf, int anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double getBase() {
        return base;
    }

    @Override
    public double calcBonus(int anoAtual) {
        if(getTotalCompras() > 12000.00){
            return(calcBonus() * getBase());
        }
       return 0; 
    }

}
