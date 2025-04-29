
package specification;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Sigaa{
    private Regra regra;

    public Sigaa(Regra regra) {
        this.regra = regra;
    }
    
    public boolean isSpecifiedBy(Aluno a){
        return this.regra.isSpecifiedBy(a);
    }
}
