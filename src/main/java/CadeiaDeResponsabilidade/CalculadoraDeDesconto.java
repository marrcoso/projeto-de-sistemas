
package CadeiaDeResponsabilidade;


public class CalculadoraDeDesconto {
    public double calcularDesconto(Pedido pedido) {
        Desconto desconto10 = new DecontoPorMaisDe10Itens();
        SemDesconto semDesconto = new SemDesconto();
        
        desconto10.definirSucessor(semDesconto);
        
        return desconto10.valor(pedido);
    }
}
