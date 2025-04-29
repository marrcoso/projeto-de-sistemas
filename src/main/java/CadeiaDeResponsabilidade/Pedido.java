
package CadeiaDeResponsabilidade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Pedido {
    private String nomePedido;
    List<Item> itens;

    public Pedido(String nomePedido) {
        this.nomePedido = nomePedido;
        this.itens = new ArrayList<>();
    }
    
    public void adicionar(Item item){
        itens.add(item);
    }
    
    public int quantidadeDeItens(){
        return itens.size();
    }
    
    public double total() {
        double total = 0.0;
        for (Item it : itens) {
            total += it.preco();
        }
        return total;
    }
    
}
