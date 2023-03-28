import fatec.poo.model.contaBancaria;
import java.text.DecimalFormat;
import java.util.Scanner;

public class aplicacaoContaCorrente {

    public static void main(String[] args) {
        
        int opcao,i;
        double valor;
        int num = 15;
        
        Scanner operacao = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        contaBancaria[] banco = new contaBancaria[num];
        
        int numero;
        double saldo;
        
        for (i =0; i < num; i++)
        {
            System.out.print("Digite o numero da conta: ");
            numero = operacao.nextInt();
        
            System.out.print("Digite o saldo da conta:R$ ");
            saldo = operacao.nextDouble();
        
            banco[i] = new contaBancaria(numero, saldo);
        }
        
        do {
            
            System.out.println("\n1 –Depositar");
            System.out.println("2 –Sacar");
            System.out.println("3 –Consultar Saldo");
            System.out.println("4 - Listar Contas");
            System.out.println("5 - Sair");
            
            System.out.print("\n\nDigite uma opcao: ");
            opcao = operacao.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Numero da conta a pesquisar: ");
                    numero = operacao.nextInt();
                    for(i=0;i<15; i++)
                    {
                        if(banco[i].getNumero() == numero)
                        {
                            break;
                        }
                    }
                    if(i == 15)
                    {
                      System.out.print("Conta não Cadastrada");  
                    }
                    
                    else
                    {
                        System.out.println("Numero da conta: "+banco[i].getNumero());
                        System.out.print("Digite o valor a ser Depositado: R$ ");
                        valor = operacao.nextDouble();
                        banco[i].depositar(valor);   
                    }
                    break;
                case 2:
                    System.out.print("Numero da conta a pesquisar: ");
                    numero = operacao.nextInt();
                    for(i=0;i<15; i++)
                    {
                        if(banco[i].getNumero() == numero)
                        {
                            break;
                        }
                    }
                    if(i == 15)
                    {
                      System.out.print("Conta não Cadastrada");  
                    }
                    
                    else
                    {
                        if(banco[i].getNumero() == numero)
                        {
                            System.out.println("Numero da conta: "+banco[i].getNumero());
                            System.out.print("Digite o valor a ser Sacado: R$ ");
                            valor = operacao.nextDouble();
                        if(banco[i].getSaldo() < valor)
                        {
                            System.out.println("Saldo Insuficiente");
                        }
                        else
                        {
                            banco[i].sacar(valor);
                        }
                        }   
                    }
                    break;
                case 3:
                    System.out.print("Numero da conta a pesquisar: ");
                    numero = operacao.nextInt();
                    for (i = 0; i < num; i++)
                    {
                        if(banco[i].getNumero() == numero)
                        {
                            break;
                        }
                    }
                    if(i == 15)
                    {
                       System.out.println("Conta nao cadastrada!"); 
                    }
                    else{
                         System.out.println("Numero da conta: "+banco[i].getNumero()+"\nSaldo: R$"+df.format(banco[i].getSaldo()));
                         System.out.println(banco[i].getNumero()+ "\t\t\tR$ "+df.format(banco[i].getSaldo()));
                    }
                    break;
                case 4:
                     System.out.println("Numero da conta: "+"\tSaldo:");
                     for (i = 0; i < num; i++)
                    {
                        System.out.println(banco[i].getNumero()+ "\t\tsR$ "+df.format(banco[i].getSaldo()));
                    }
                break;
            }  
        }while(opcao != 5);
    }
}
