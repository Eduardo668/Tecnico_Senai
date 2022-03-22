package br.com.ExercicioHeranca3.model;

public class Pedido {
    private String data;
    private Cliente cliente;
    private ItensDoPedido itens;

    public Pedido(){
        this.itens = new ItensDoPedido();

    }
    public void setItens(ItensDoPedido itens){
        this.itens = itens;
    }

    public void setItens(String produto, double preco){
        itens.setProduto(produto, preco);

    }
    public void setItens(double total){
//       itens.setProduto(produto, preco);
        itens.setTotal(total);
    }


    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setCliente(String nome, String cpf, String email,String rua, int numero){
        cliente.setEmail(email);
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(rua, numero);
    }


    public void setPedido(String data, String pedido){
        this.data = data;

    }

}
