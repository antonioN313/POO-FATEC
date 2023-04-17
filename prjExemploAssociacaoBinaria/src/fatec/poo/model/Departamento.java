
package fatec.poo.model;
/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario funcionario[];
    private int numFunc;
    

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario func)
    {
        funcionario[numFunc] = func;
        numFunc++;
    }
    public void listarFuncionario()
    {
        String tipo;

        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
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
