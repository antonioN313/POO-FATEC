import fatec.poo.model.contaBancaria;
import java.util.Scanner;
public class aplicacaoContaCorrente {

    public static void main(String[] args) {
        
        int numero,opcao;
        double saldo,valor;
        
        Scanner operacao = new Scanner(System.in);
        
        System.out.print("Digite o numero da conta: ");
        numero = operacao.nextInt();
        
        System.out.print("Digite o saldo da conta:R$ ");
        saldo = operacao.nextDouble();
        
        contaBancaria objConta = new contaBancaria(numero, saldo);
        
        do {
            
            System.out.println("\n1 –Depositar");
            System.out.println("2 –Sacar");
            System.out.println("3 –Consultar Saldo");
            System.out.println("4 - Sair");
            
            System.out.print("\n\nDigite uma opcao: ");
            opcao = operacao.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Numero da conta: "+objConta.getNumero());
                    System.out.print("Digite o valor a ser Depositado: R$ ");
                    valor = operacao.nextDouble();
                    objConta.depositar(valor);
                    break;
                case 2:
                    System.out.println("Numero da conta: "+objConta.getNumero());
                    System.out.print("Digite o valor a ser Sacado: R$ ");
                    valor = operacao.nextDouble();
                    if(objConta.getSaldo() < valor)
                    {
                        System.out.println("Saldo Insuficiente");
                        break;
                    }
                    else
                    {
                        objConta.sacar(valor);
                    }
                    
                    break;
                case 3:
                    System.out.println("Numero da conta: "+objConta.getNumero());
                    System.out.println("Saldo: R$ "+objConta.getSaldo());
                    break;       
            }
            
            
        }while(opcao != 4);
        
        
    }
    
}
