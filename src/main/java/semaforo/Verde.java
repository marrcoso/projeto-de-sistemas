
package semaforo;


public class Verde implements Estado{
    public String nome() {
        return "Verde";
    }
    
    public void alternar(Semaforo semaforo){
        semaforo.alternar(new Amarelo());
    }
}
