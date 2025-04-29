
package jornal;

import java.util.ArrayList;
import java.util.List;


public class Noticia implements Subject{
    private String titulo;
    private String conteudo;
    private List<Observador> observadores;
    

    public Noticia(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.observadores = new ArrayList<>();
    }

    @Override
    public void registrar(Observador usuario) {
        this.observadores.add(usuario);
        this.notificar();
    }

    @Override
    public void notificar() {
        for(Observador it : this.observadores){
            it.atualizar();
        }
    }

    @Override
    public void desregistrar(Observador usuario) {
        this.observadores.remove(usuario);
    }
}
