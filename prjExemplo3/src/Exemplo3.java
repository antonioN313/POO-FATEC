import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        
        int numero,resultado,i=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        
        while(i <=10)
        {
            resultado = numero * i;
            System.out.println(numero +" X "+ i +" = "+ resultado);
            i++;
        }   
    }
    
}