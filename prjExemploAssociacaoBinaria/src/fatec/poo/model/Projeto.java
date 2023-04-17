package fatec.poo.model;
public class Projeto {
   private int codigo;
   private String descricao;
   private String dtInicio;
   private String dtTermino;
   private Funcionario funcionario[];
   private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }
   public void addFuncionario(Funcionario func)
    {
        funcionario[numFunc] = func;
        numFunc++;
    }
   public void listarFuncionario()
    {
        String tipo;

        System.out.println("\n\nSigla: " + codigo);
        System.out.println("Nome: " + descricao);
        System.out.println("QtdeFunc: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tTipo");
        for (int i = 0; i < numFunc; i++) {
            if (funcionario[i] instanceof FuncionarioHorista) {
                tipo = "Horista";
            } else if (funcionario[i] instanceof FuncionarioMensalista) {
                tipo = "Mensalista";
            } else {
                tipo = "Comissionado";
            }
            System.out.print(funcionario[i].getRegistro());
            System.out.print("\t\t"+funcionario[i].getNome());
            System.out.println("\t\t"+tipo);

        }
    }
}
