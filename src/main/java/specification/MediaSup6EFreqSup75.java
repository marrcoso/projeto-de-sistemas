
package specification;


public class MediaSup6EFreqSup75 implements Regra{

    @Override
    public boolean isSpecifiedBy(Aluno a) {
        return a.getMedia() >= 6 && a.getFrequencia() >= 75;
    }
}
