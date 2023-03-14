package fatec.poo.model;

public class contaBancaria {
    
    private int numero;
    private double saldo;
    
    public contaBancaria(int num, double sal)
    {
        numero = num;
        saldo = sal;
    }
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double saque)
    {
        saldo -= saque;
    }
    
    public void depositar(double valor)
    {
        saldo += valor;
    }
    
}
