
package pedido;


public class Estudante implements Desconto{
    private int porcentagem;

    public Estudante(int porcentagem) {
        this.porcentagem = porcentagem;
    }
    
    @Override
    public int desconto(Pedido p) {
        return p.valor() * this.porcentagem/100;
    }
}
