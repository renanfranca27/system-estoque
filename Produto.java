public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private int quantidade;
    private double preco;
    private String localizacao;

    // Construtores, getters e setters
    public Produto(String nome, String categoria, int quantidade, double preco, String localizacao) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.preco = preco;
        this.localizacao = localizacao;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
}
