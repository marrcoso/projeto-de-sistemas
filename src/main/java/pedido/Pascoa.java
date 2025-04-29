
package pedido;


public class Pascoa implements Desconto{
    private int porcentagem;

    public Pascoa(int porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public int desconto(Pedido p) {
        return p.valor() * this.porcentagem/100;
    }
    
}
