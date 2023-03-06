import java.util.Scanner;
import fatec.poo.model.Retangulo;
public class programaRetangulo {

    public static void main(String[] args) {
        
        //declarações de variaveis
        double altura,base;
        
        //Instanciações das classes
        Scanner valor = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        //entrada de dados
        System.out.print("Digite a medida da altura: ");
        altura = valor.nextDouble();
        System.out.print("Digite a medida da base: ");
        base = valor.nextDouble();
        
        //passagem das variaveis nos metodos da classe
        objRet.setAltura(altura);
        objRet.setBase(base);
        
        //saida dos resultados
        System.out.println("\nMedida da Altura: " + objRet.getAltura());
        System.out.println("Medida do Base: " + objRet.getBase());
        System.out.println("\nMedida da Área: " + objRet.calcArea());
        System.out.println("Medida do Perimetro: " + objRet.calcPerimetro());
        
    }
    
}
