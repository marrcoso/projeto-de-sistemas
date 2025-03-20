package formasdepagamento;

public class Dinheiro implements FormaDePagamento{
    public int porcentagemDeDesconto;

    public Dinheiro(int desconto) {
        this.porcentagemDeDesconto = desconto;
    }

    @Override
    public int formaDePagamento(Pedido p) {
        return p.valor()*porcentagemDeDesconto/100;
    }

}
