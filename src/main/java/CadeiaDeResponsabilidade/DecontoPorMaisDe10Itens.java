
package CadeiaDeResponsabilidade;


public class DecontoPorMaisDe10Itens implements Desconto{
    private Desconto descontoSucessor;
    
    @Override
    public double valor(Pedido pedido) {
        if (pedido.quantidadeDeItens() > 10) {
            return pedido.total() - (pedido.total()) * 0.2;
        }
        return descontoSucessor.valor(pedido);
    }

    @Override
    public void definirSucessor(Desconto desconto) {
        this.descontoSucessor = desconto;
    }
    
    
}
