public class Main {
    public static void main(String[] args) {
        EstoqueController controller = new EstoqueController();
        
        Produto produto = new Produto("Produto A", "Categoria 1", 100, 19.99, "Depósito A - Prateleira 1");
        controller.cadastrarProduto(produto);
        
        System.out.println("Produto cadastrado com sucesso!");
    }
}
