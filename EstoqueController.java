import java.sql.*;

public class EstoqueController {
    public void cadastrarProduto(Produto produto) {
        String sql = "INSERT INTO produtos(nome, categoria, quantidade, preco, localizacao) VALUES(?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseHelper.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, produto.getNome());
            pstmt.setString(2, produto.getCategoria());
            pstmt.setInt(3, produto.getQuantidade());
            pstmt.setDouble(4, produto.getPreco());
            pstmt.setString(5, produto.getLocalizacao());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
