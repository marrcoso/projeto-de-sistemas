
package jornal;


public class Usuario implements Observador{
    private String nome;
    private String mail;

    public Usuario(String nome, String mail) {
        this.nome = nome;
        this.mail = mail;
    }

    @Override
    public void atualizar() {
        System.out.println("Você foi notificado!");
    }
}
