package fatec.poo.model;
public abstract class Funcionario {  
    private int registro;
    private String nome;
    private String Cargo;
    private String dtAdmissao;
    
    public Funcionario(int registro, String nome,String dtAdmissao){
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
    
   public void setCargo(String Cargo){
       this.Cargo = Cargo;
   }
    
   public int getRegistro() {
        return registro;
    }

   public String getNome() {
        return nome;
    }
   public String getCargo(){
       return Cargo;
   }

    public String getDtAdmissao() {
        return dtAdmissao;
    }
}
