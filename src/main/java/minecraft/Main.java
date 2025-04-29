
package minecraft;


public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(100);
        Pessoa alvo = new Pessoa(100);
        
        p.escolherArma(new Machado(50));
        p.atacar(alvo);
        
        System.out.println(alvo.vida());   
    }
}
