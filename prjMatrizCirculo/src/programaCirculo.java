import java.util.Scanner;
import java.text.DecimalFormat;
import fatec.poo.model.Circulo;
public class programaCirculo {

    public static void main(String[] args) {
        
        String unidadeMedida;
        
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner valor = new Scanner(System.in);
        
        Circulo[] matCir = new Circulo[10];
        double raio;
        int i;
        
        for (i = 0 ; i < 10; i++)
        {
            System.out.print("Digite a unidade de medida desejada: ");
            unidadeMedida = valor.next();
            matCir[i]= new Circulo(unidadeMedida);
        
            System.out.print("Digite um valor para Raio: ");
            raio = valor.nextDouble();
        
            matCir[i].setRaio(raio);
        }
 
        for (i = 0 ; i < 10; i++)
        {
            System.out.println("\n\nObjeto Circulo " + (i+1));
            System.out.println("\nMedida do raio: "+ df.format(matCir[i].getRaio()) + " " + matCir[i].getMedida());
            System.out.println("Calculo da Area: "+ df.format(matCir[i].calcArea()) + " " + matCir[i].getMedida() + "²");
            System.out.println("Calculo do Perimetro: "+ df.format(matCir[i].calcPerimetro())+ " " + matCir[i].getMedida());
            System.out.println("Calculo do Diametro: "+ df.format(matCir[i].calcDiametro())+ " " + matCir[i].getMedida());
        }
    }
    
}
