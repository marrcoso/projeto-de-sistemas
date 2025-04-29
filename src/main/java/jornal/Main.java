
package jornal;


public class Main {
    public static void main(String[] args) {
        Observador user1 = new Usuario("Marcus", "marcus");
        Observador user2 = new Usuario("Gisele", "gisele");
        
        Subject noticia = new Noticia("A", "B");
        
        noticia.registrar(user1);
        noticia.registrar(user2);
    }
}
