
package minecraft;


public class Pessoa {
    private int vida;
    private Arma arma;

    public Pessoa(int vida) {
        this.vida = vida;
        this.arma = new Desarmado();
    }
    
    public void escolherArma(Arma arma) {
        this.arma = arma;
    }
    
    public int vida() {
        return this.vida;
    }
    
    public int atacar(Pessoa alvo) {
        return alvo.vida = alvo.vida() - this.arma.retirarVida();
    }
    
}
