package fatec.poo.model;
import java.util.ArrayList;

public class Pedido {
    
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente; //multiplicidade 1
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itemPedidos;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itemPedidos = new ArrayList<ItemPedido>();
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }
    
   public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void addItemPedido(ItemPedido ip) {
        itemPedidos.add(ip);
        ip.setPedido(this);
        this.cliente.setLimiteCred(this.cliente.getLimiteCred() - (ip.getProduto().getPreco() * ip.getQtdeVendida()));
    }
    
    
}
