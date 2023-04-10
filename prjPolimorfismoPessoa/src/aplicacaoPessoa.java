import fatec.poo.model.*;
import java.text.DecimalFormat;
import java.util.Calendar;

public class aplicacaoPessoa {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Calendar data = Calendar.getInstance();
        
        PessoaFisica pf = new PessoaFisica("Carlos Alberto", "123.485.778-0", 2003);
        PessoaJuridica pj = new PessoaJuridica("Carmina Burana","12.345.687/0001", 1995);
        
        pf.setBase(1550.75);
        pf.addCompras(365.88);
        pf.addCompras(99.99);
        
        pj.setTaxaIncentivo(0.10);
        pj.addCompras(365.88);
        pj.addCompras(99.99);
        
        
        System.out.println("\tPessoa Fisica");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Base: R$"+df.format(pf.getBase()));
        System.out.println("Total das Compras: R$"+df.format(pf.getTotalCompras()));
        System.out.println("Bonus Salarial: R$" + df.format(pf.calcBonus(data.get(Calendar.YEAR))));
        
        System.out.println("\tPessoa Juridica");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("CPF: " + pj.getCgc());
        System.out.println("Taxa De incentivo: "+df.format(pj.getTaxaIncentivo()) + "%");
        System.out.println("Total das Compras: R$"+df.format(pf.getTotalCompras()));
        System.out.println("Bonus Salarial: R$" + df.format(pf.calcBonus(data.get(Calendar.YEAR))));
        
        
        
        
    }
    
}
