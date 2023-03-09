package fatec.poo.model;
public class Livro {
   
   private int identificacao;
   private boolean situacao;
   private double valMultaDiaria;
   
    public int getIdentificacao() {
        return identificacao;
    }
    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }
    
    public void emprestar()
    {
        situacao = true;
    }
    public double devolver(int diasAtraso){
        return (valMultaDiaria * diasAtraso);
    }
   
}
