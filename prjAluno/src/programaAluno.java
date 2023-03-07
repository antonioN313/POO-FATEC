import java.util.Scanner;
import fatec.poo.model.Aluno;

public class programaAluno {

    public static void main(String[] args){
        
        int RA,opcao;
        double ntPrv1,ntPrv2,ntTrab1,ntTrab2;
        
        Scanner valor = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.println("Digite o RA: ");
        RA = valor.nextInt();
        System.out.println("Digite a nota de Prova 1: ");
        ntPrv1 = valor.nextDouble();
        System.out.println("Digite a nota de Prova 2: ");
        ntPrv2 = valor.nextDouble();
        System.out.println("Digite a nota de Trabalho 1: ");
        ntTrab1 = valor.nextDouble();
        System.out.println("Digite a nota de Trabalho 2: ");
        ntTrab2 = valor.nextDouble();
        
        objAluno.setRA(RA);
        objAluno.setntPrv1(ntPrv1);
        objAluno.setntPrv2(ntPrv2);
        objAluno.setntTrab1(ntTrab1);
        objAluno.setntTrab2(ntTrab2);
        
        
        do {
            System.out.println("\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Media das Provas/Trabalhos");
            System.out.println("3 - Exibir Media Final");
            System.out.println("4 - Sair");
            
            System.out.print("\n\nDigite uma opcao: ");
            opcao = valor.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("RA: "+ objAluno.getRA());
                    System.out.println("Prova 1: "+ objAluno.getntPrv1());
                    System.out.println("Prova 2: "+ objAluno.getntPrv2());
                    System.out.println("Trabalho 1: "+ objAluno.getntTrab1());
                    System.out.println("Trabalho 2: "+ objAluno.getntTrab2());
                    break;
                case 2:
                    System.out.println("Media das Provas: "+ objAluno.calcMediaProva());
                    System.out.println("Media dos Trabalhos: "+ objAluno.calcMediaTrab());
                    break;
                case 3:
                    System.out.println("Media Final: "+ objAluno.calcMediaFinal());
                    break;       
                default:
                    break;
            }
            
            
        }while(opcao != 4);
            
    }  
}
