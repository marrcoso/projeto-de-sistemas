
package minecraft;


public class Machado implements Arma{
    private int dano;

    public Machado(int dano) {
        this.dano = dano;
    }
    
    @Override
    public int retirarVida() {
        return this.dano;
    }
    
    
}
