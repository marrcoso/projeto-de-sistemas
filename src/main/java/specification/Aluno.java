
package specification;

import java.util.ArrayList;
import java.util.List;


class Aluno {
    private String nome;
    private int media;
    private float frequencia;

    public Aluno(String nome, int media, float frequencia) {
        this.nome = nome;
        this.media = media;
        this.frequencia = frequencia;
    }

    public String getNome() {
        return nome;
    }

    public int getMedia() {
        return media;
    }

    public float getFrequencia() {
        return frequencia;
    }
    
    
}
