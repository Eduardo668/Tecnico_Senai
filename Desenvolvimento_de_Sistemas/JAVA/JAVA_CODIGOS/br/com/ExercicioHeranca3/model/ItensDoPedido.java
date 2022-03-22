package br.com.ExercicioHeranca3.model;


public class ItensDoPedido {
    private Produto produto;
    private double total;

    public ItensDoPedido(){
        this.produto = new Produto();
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }

    public void setProduto(String produto, double preco){
        this.produto.setProdutos(produto);
        this.produto.setPreco(preco);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return produto.toString()+
                "Total: "+ getTotal();
    }
}
