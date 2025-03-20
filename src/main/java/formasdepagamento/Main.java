package formasdepagamento;

public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido(100);

        p.definirPagamento(new Debito(120));

        System.out.println(p.valor());
        System.out.println(p.valorDoPagamento());
        System.out.println(p.valorTotal());
    }
}
