import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args){
       
       int codProd,qtdeVend;
       String descProd;
       double precUnit,Valcompra,desconto;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("Digite o codigo do produto: ");
       codProd = input.nextInt();
       System.out.print("Digite a descricao: ");
       descProd= input.next();
       System.out.print("Digite o Preco Unitario: ");
       precUnit = input.nextDouble();
       System.out.print("Digite a qt de Vendas: ");
       qtdeVend = input.nextInt();
       
       Valcompra = qtdeVend * precUnit;
       
       if(Valcompra >= 850)
       {
           desconto = 0.10 * Valcompra;
       }
       else
       {
           desconto = 0;
       }
       
       System.out.printf("\nCódigo do Produto: %d\n",codProd);
       System.out.printf("Quantidade de Vendas: %d\n",qtdeVend);
       System.out.printf("Descricao: %s\n",descProd);
       System.out.printf("Preco Unitario: R$ %.2f\n",precUnit);
       System.out.printf("Valor do Desconto: R$ %.2f\n",desconto);
       System.out.printf("Valor da Compra: R$ %.2f\n",Valcompra - desconto);
    }
    
}
