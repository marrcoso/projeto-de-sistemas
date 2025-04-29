
package semaforo;


public class Amarelo implements Estado{
    public String nome() {
        return "Amarelo";
    }
    
    public void alternar(Semaforo semaforo){
        semaforo.alternar(new Vermelho());
    }
}
