
package musica;

import java.util.List;


public class Piano {
    public void tocar(List<Nota> composicao) {
        String musica = "";
        
        for (Nota n : composicao){
            musica += n.simbolo();
            musica += " ";
            System.out.println(musica);
        }
    }
}
