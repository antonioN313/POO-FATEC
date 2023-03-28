import fatec.poo.model.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class aplicacaoPessoa {

    public static void main(String[] args) {
        
        String nome,telefone,areaAtuacao,cpf;
        int identificacao;
        double peso,altura;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##0.00");
        
        System.out.println("Instrutor");
        System.out.print("Digite o nome:");
        nome = entrada.next();
        System.out.print("Telefone:");
        telefone = entrada.next();
        System.out.print("Codigo de Identificacao:");
        identificacao = entrada.nextInt();
        System.out.print("Area de Atuação:");
        areaAtuacao = entrada.next();
        
        Instrutor objIns = new Instrutor(identificacao, nome, telefone);
        objIns.setAreaAtuacao(areaAtuacao);
        

        System.out.println("Cliente");
        System.out.print("Digite o nome:");
        nome = entrada.next();
        System.out.print("Telefone:");
        telefone = entrada.next();
        System.out.print("Digite o cpf:");
        cpf = entrada.next();
        System.out.print("Digite o Peso:");
        peso = entrada.nextDouble();
        System.out.print("Digite o Altura:");
        altura = entrada.nextDouble();
        
        Cliente objCli = new Cliente(cpf, nome, telefone);
        
        objCli.setAltura(altura);
        objCli.setPeso(peso);
        
        /*Exibição dos dados atribuidos*/
        System.out.println("\nInstrutor");
        System.out.println("Nome: "+ objIns.getNome());
        System.out.println("Telefone: "+ objIns.getTelefone());
        System.out.println("Cod. Identificacao: "+ objIns.getIdentificacao());
        System.out.println("Area de Atuação: "+objIns.getAreaAtuacao());
        
        System.out.println("\nCliente");
        System.out.println("Nome: "+ objCli.getNome());
        System.out.println("Telefone: "+ objCli.getTelefone());
        System.out.println("CPF: "+ objCli.getCpf());
        System.out.println("Peso: "+df.format(objCli.getPeso())+ "Kg");
        System.out.println("Altura: "+df.format(objCli.getAltura())+ "m");
        System.out.println("IMC: "+ df.format(objCli.calcIMC(altura, peso))+ "Kg/m²");
        
    }
    
}
