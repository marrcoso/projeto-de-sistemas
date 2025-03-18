
package semaforo;


public class Semaforo{
        private Estado estado;

        public Semaforo(Estado estado) {
            this.estado = new Vermelho;
        }   
        
        public void ligar(){
            for (int i = 0; i < 10; i++) {
                estado.nome(this.nome);
                estado.alternar();
            }
        }
        
        public void alternar(Semaforo semaforo) {
            this.estado = estado;
        }
}
