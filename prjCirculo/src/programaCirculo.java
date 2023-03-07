import java.util.Scanner;
import fatec.poo.model.Circulo;
public class programaCirculo {

    public static void main(String[] args) {
        double raio;
        
        Scanner valor = new Scanner(System.in);
        Circulo objCir = new Circulo();
        
        System.out.print("Digite um valor para Raio: ");
        raio = valor.nextDouble();
        
        objCir.setRaio(raio);
        
        System.out.println("\nMedida do raio: "+ objCir.getRaio());
        System.out.println("Calculo da Area: "+ objCir.calcArea());
        System.out.println("Calculo do Perimetro: "+ objCir.calcPerimetro());
        System.out.println("Calculo do Diametro: "+ objCir.calcDiametro());
    }
    
}
