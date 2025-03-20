package formasdepagamento;

public class Pedido {
    private int valor;
    private FormaDePagamento f;

    public Pedido(int valor) {
        this.valor = valor;
    }

    public int valor() {
        return this.valor;
    }

    public void definirPagamento(FormaDePagamento f) {
        this.f = f;
    }

    public int valorDoPagamento() {
        return this.f.formaDePagamento(this);
    }

    public int valorTotal() {
        return this.valor-valorDoPagamento();
    }
}
