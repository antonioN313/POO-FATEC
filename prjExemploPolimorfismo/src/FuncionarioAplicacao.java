import java.util.Scanner;
import java.text.DecimalFormat;
import fatec.poo.model.*;

public class FuncionarioAplicacao {
    public static void main(String[] args) {
        
        int registro;
        String nome;
        String dtAdmissao;
        String Cargo;
        double valHorTrab,valSalMin,numSalMin;
        int qtdeHorTrab;
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Registro do Funcionario: ");
        registro = entrada.nextInt();
        System.out.print("Nome: ");
        nome = entrada.next();
        System.out.print("Data de Admissao: ");
        dtAdmissao = entrada.next();
        System.out.print("Cargo: ");
        Cargo = entrada.next();
        System.out.print("Valor R$ de Horas Trabalhadas: ");
        valHorTrab = entrada.nextDouble();
        System.out.print("Quantidade de Horas Trabalhadas: ");
        qtdeHorTrab = entrada.nextInt();
        
        FuncionarioHorista funcHor = new FuncionarioHorista(registro,nome,dtAdmissao,valHorTrab,qtdeHorTrab);
        
        funcHor.setQtdeHorTrab(qtdeHorTrab);
        funcHor.setCargo(Cargo);
        
        System.out.print("\nRegistro do Funcionario: ");
        registro = entrada.nextInt();
        System.out.print("Nome: ");
        nome = entrada.next();
        System.out.print("Data de Admissao: ");
        dtAdmissao = entrada.next();
        System.out.print("Cargo: ");
        Cargo = entrada.next();
        System.out.print("Valor R$ do Salario Minimo: ");
        valSalMin = entrada.nextDouble();
        System.out.print("Numero do Salario Minimo: ");
        numSalMin = entrada.nextDouble();
        
        FuncionarioMensalista funcMen = new FuncionarioMensalista(registro, nome, dtAdmissao, valSalMin, numSalMin);
        
        funcMen.setNumSalMin(numSalMin);
        funcMen.setCargo(Cargo);
        
        System.out.println("\tFuncionario Horista\t");
        System.out.println("Registro: "+funcHor.getRegistro());
        System.out.println("Nome: "+funcHor.getNome());
        System.out.println("Data de Admissão: "+funcHor.getDtAdmissao());
        System.out.println("Cargo: "+funcHor.getCargo());
        System.out.println();
        System.out.println("Salario Bruto: R$ "+df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto: " +df.format(funcHor.calcDesconto())+"%");
        System.out.println("Gratificaçao: "+df.format(funcHor.calcGratificacao()));
        System.out.println("Salario Liquido: R$ "+df.format(funcHor.calcSalLiquido()));
        
        System.out.println();
        System.out.println("\tFuncionario Mensalista\t");
        System.out.println("Registro: "+funcMen.getRegistro());
        System.out.println("Nome: "+funcMen.getNome());
        System.out.println("Data de Admissão: "+funcMen.getDtAdmissao());
        System.out.println("Cargo: "+funcMen.getCargo());
        System.out.println("Salario Bruto: R$ "+df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto: " +df.format(funcMen.calcDesconto())+"%");
        System.out.println("Salario Liquido: R$ "+df.format(funcMen.calcSalLiquido()));
    }
    
}
