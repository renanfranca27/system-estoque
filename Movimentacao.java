import java.util.Date;

public class Movimentacao {
    private int id;
    private int produtoId;
    private String tipo;
    private int quantidade;
    private Date data;

    // Construtores, getters e setters
    public Movimentacao(int produtoId, String tipo, int quantidade, Date data) {
        this.produtoId = produtoId;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.data = data;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getProdutoId() { return produtoId; }
    public void setProdutoId(int produtoId) { this.produtoId = produtoId; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
}
