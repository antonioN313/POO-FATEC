import java.util.Scanner;
import fatec.poo.model.Livro;

public class aplicacaoLivro {
    public static void main(String[] args) {
        int identificacao,diasAtraso,opcao;
        double valMultaDiaria;
        
        Scanner entrada = new Scanner (System.in);
        Livro objLivro = new Livro();
        
        System.out.println("Digite o codigo de identificacao: ");
        identificacao = entrada.nextInt();
        System.out.println("Digite o valor da multa diaria: ");
        valMultaDiaria = entrada.nextDouble(); 
        
        objLivro.setIdentificacao(identificacao);
        objLivro.setValMultaDiaria(valMultaDiaria);
        
        do {
            System.out.println("\n1 - Consultar Livro");
            System.out.println("2 - Emprestar Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Sair");
            
            System.out.print("\nDigite uma opcao: ");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Codigo do Livro: "+ objLivro.getIdentificacao());
                    if(objLivro.isSituacao() == false)
                    {
                      System.out.println("Situacao: Disponivel");
                    }
                    else
                    {
                      System.out.println("Situacao: Emprestado");
                    }
                    break;
                case 2:
                    if(objLivro.isSituacao() == true)
                    {
                        System.out.println("O livro está emprestado");
                    }
                    else
                    {
                        objLivro.emprestar();
                    }
                    break;
                case 3:
                    if(objLivro.isSituacao() == false)
                    {
                        System.out.println("O livro já esta disponivel");
                    }
                    else
                    {
                        System.out.println("Digite os dias de atraso: ");
                        diasAtraso = entrada.nextInt();
                        objLivro.devolver(diasAtraso);
                    }
                    break;       
                default:
                    break;
            }
            
            
        }while(opcao != 4);
    }
    
}
