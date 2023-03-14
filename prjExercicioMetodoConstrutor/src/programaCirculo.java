import java.util.Scanner;
import fatec.poo.model.Circulo;
public class programaCirculo {

    public static void main(String[] args) {
        double raio;
        String unidadeMedida;
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite a unidade de medida desejada: ");
        
        Circulo objCir = new Circulo(unidadeMedida = valor.next());
        
        System.out.print("Digite um valor para Raio: ");
        raio = valor.nextDouble();
        
        objCir.setRaio(raio);
        
        System.out.println("\nMedida do raio: "+ objCir.getRaio() + " " + objCir.getMedida());
        System.out.println("Calculo da Area: "+ objCir.calcArea() + " " + objCir.getMedida() + "²");
        System.out.println("Calculo do Perimetro: "+ objCir.calcPerimetro()+ " " + objCir.getMedida());
        System.out.println("Calculo do Diametro: "+ objCir.calcDiametro()+ " " + objCir.getMedida());
    }
    
}
