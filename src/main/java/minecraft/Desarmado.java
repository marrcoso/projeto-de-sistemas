
package minecraft;


public class Desarmado implements Arma{
    private int dano;

    public Desarmado() {
        this.dano = 0;
    }

    @Override
    public int retirarVida() {
        return this.dano;
    }
}
