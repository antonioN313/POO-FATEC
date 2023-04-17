import fatec.poo.model.quartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

public class aplicacaoHotel {

    public static void main(String[] args) {
        
        int numQuarto,numRG,dias,opcao,qtquartos = 10,i;
        double valorDiaria,faturamentoHotel = 0;
        
        Scanner pedido = new Scanner (System.in);
        DecimalFormat pedidoDF = new DecimalFormat("#,##00.00");
        
        quartoHotel[] quarto;
        quarto = new quartoHotel[qtquartos];
        
        for(i = 0; i< qtquartos;i++)
        {
            System.out.println("Numero do quarto:");
            numQuarto = pedido.nextInt();
            System.out.println("Valor da Diaria: ");
            valorDiaria = pedido.nextDouble();
            quarto[i] = new quartoHotel(numQuarto,valorDiaria);
        }
        
        do{
            System.out.println("\n1 –Consultar quarto");
            System.out.println("2 –Reservar quarto");
            System.out.println("3 –Liberar quarto");
            System.out.println("4 -Consultar Faturamento quarto");
            System.out.println("5 -Consultar Faturamento hotel");
            System.out.println("6 -Sair");
            
            System.out.print("\n\nDigite uma opcao: ");
            opcao = pedido.nextInt();
            
            switch(opcao)
            {
                case 1:
                    System.out.println("Numero do quarto:");
                    numQuarto = pedido.nextInt();
                    for(i=0;i<qtquartos; i++)
                    {
                        if(quarto[i].getNumQuarto()== numQuarto)
                        {
                            break;
                        }
                    }
                    if(i == 10)
                    {
                      System.out.print("Quarto não Cadastrado");  
                    }
                case 2:
                    System.out.println("Numero do quarto:");
                    numQuarto = pedido.nextInt();
                    for(i=0;i<qtquartos; i++)
                    {
                        if(quarto[i].getNumQuarto()== numQuarto)
                        {
                            if(quarto[i].isSituacao() == false)
                            {
                                System.out.println("Digite o numero de RG: ");
                                numRG = pedido.nextInt();
                                quarto[i].reservar(numRG);
                                
                            }
                            else{
                                System.out.println("Quarto já foi reservado.");
                            }
                            break;
                        }
                    }
                    if(i == 10)
                    {
                      System.out.print("Quarto não Cadastrado");  
                    }
                    
                case 3:
                    System.out.println("Numero do quarto:");
                    numQuarto = pedido.nextInt();
                    for(i=0;i<qtquartos; i++)
                    {
                        if(quarto[i].getNumQuarto()== numQuarto)
                        {
                            if(quarto[i].isSituacao() == true)
                            {
                                System.out.println("Quantidades de dias no quarto:");
                                dias = pedido.nextInt();
                                quarto[i].liberar(dias);
                                
                            }
                            else{
                                System.out.println("Quarto já está livre.");
                            }
                            break;
                        }
                    }
                    if(i == 10)
                    {
                      System.out.print("Quarto não Cadastrado");  
                    }
                    
                case 4:
                    System.out.println("Numero do quarto:");
                    numQuarto = pedido.nextInt();
                    for(i=0;i<qtquartos; i++)
                    {
                        if(quarto[i].getNumQuarto()== numQuarto)
                        {
                            System.out.println("Quarto:"+ quarto[i].getNumQuarto());
                            System.out.println("Faturamento total:R$ "+pedidoDF.format(quarto[i].getTotalFaturado()));
                            break;
                        }
                    }
                    if(i == 10)
                    {
                      System.out.print("Quarto não Cadastrado");  
                    }
                case 5:                   
                    for(i=0;i<qtquartos; i++)
                    {
                        faturamentoHotel += quarto[i].getTotalFaturado();
                    }
                    
                    System.out.println("Faturamento do Hotel:R$ "+pedidoDF.format(faturamentoHotel));
                    
            }
        }while(opcao != 6);
    }
    
}
