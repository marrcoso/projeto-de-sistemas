
package composite;


public class Main {
    public static void main(String[] args) {
     Componente arquivo = new Arquivo("Novo Arquivo.txt");
     Diretorio pastaDeDocs = new Diretorio("Pasta de Documentos");
     pastaDeDocs.adicionar(arquivo);
     
    System.out.println(pastaDeDocs.exibir());
    }
}
