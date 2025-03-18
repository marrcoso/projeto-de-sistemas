
package pedido;


public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(100);
        
        pedido.definirDesconto(new Estudante(10));
        
        System.out.println(pedido.valor());
        System.out.println(pedido.valorDoDesconto());
        System.out.println(pedido.valorComDesconto());
    }
}
