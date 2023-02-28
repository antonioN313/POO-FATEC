import java.util.Scanner;
public class Exemplo2 {
    public static void main(String[] args) {
        
        int numero,resultado,i;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        
        for(i = 0; i <= 10; i++)
        {
            resultado = numero * i;
            System.out.println(numero +" X "+ i +" = "+ resultado);
        }
    }
    
}
