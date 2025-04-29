
package bd.anemico;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;


public class LivroDao {
    private DataSource dataSource;

    public LivroDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void inserir(Livro livro) {
        String sql = "INSERT INTO livro (titulo, autor) VALUES (?, ?)";
        try{
            Connection conexao = dataSource.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //retorna id serial
            //set nos VALUES do INSERT
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.executeUpdate();
            try {
                ResultSet rs = stmt.getGeneratedKeys();
                    if (rs.next()) {
                        livro.setId(rs.getInt(1));
                    }
            } catch (SQLException e) {
                throw new RuntimeException("Deu zebra.");
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro.");
        }
    }
    
    public List<Livro> listarTodos() {
        String sql = "select id, titulo, autor from Livro";
        List<Livro> livros = new ArrayList<>();

        try (Connection conexao = dataSource.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            //resultado query
            ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id"));
                livro.setAutor(rs.getString("autor"));
                livro.setTitulo(rs.getString("titulo"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Zebra.");
        }

        return livros;
    }
}
