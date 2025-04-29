
package composite;

import java.util.ArrayList;
import java.util.List;


public class Diretorio implements Componente{
    private String nome;
    private List<Componente> componentes;

    public Diretorio(String nome) {
        this.nome = nome;
        this.componentes = new ArrayList<>();
    }
    
    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public String exibir() {
        String tudo = this.nome;
        
        for(Componente it : this.componentes){
            tudo += "\n" + it.exibir() ;
        }
        
        return tudo;
    }
    
}
