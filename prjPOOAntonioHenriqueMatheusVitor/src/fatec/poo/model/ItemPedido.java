package fatec.poo.model;

public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    private Produto produto;
    private Pedido pedido;

    public ItemPedido(int sequencia, double qtdeVendida, Produto p) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;

        this.produto = p;
        this.produto.setQtdeEstoque(this.produto.getQtdeEstoque() - qtdeVendida);
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }
    
     public void setPedido(Pedido p) {
       this.pedido = p;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }
    
    public Produto getProduto() {
        return this.produto;
    }

}