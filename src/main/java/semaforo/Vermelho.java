
package semaforo;


public class Vermelho implements Estado{
    public String nome() {
        return "Vermelho";
    }
    
    public void alternar(Semaforo semaforo){
        semaforo.alternar(new Verde());
    }
}
