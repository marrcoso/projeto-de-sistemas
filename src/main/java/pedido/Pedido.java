
package pedido;

import java.util.Scanner;


public class Pedido {
    private int valor;
    private Desconto desconto;

    public Pedido(int valor) {
        this.valor = valor;
    }
    
    public void definirDesconto(Desconto desconto) {
        this.desconto = desconto;
    }
    
    public int valor() {
        return this.valor;
    }
    
    public int valorDoDesconto() {
        return this.desconto.desconto(this);
    }
    
    public int valorComDesconto () {
        return this.valor()-this.valorDoDesconto();
    }
}
