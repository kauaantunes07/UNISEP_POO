package Ex03;

public class Produto {
	// Atributos
    String nome;
    String categoria;
    String marca;
    double preco;
    int quantidade;
    String codigo;
    String validade;
    String fornecedor;
    boolean disponivel;
    double desconto;

    // Construtor
    public Produto(String nome, String categoria, String marca, double preco, int quantidade) {

        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;

        this.codigo = "12345";
        this.validade = "20/12/2026";
        this.fornecedor = "Fornecedor Brasil";
        this.disponivel = true;
        this.desconto = 0;
    }

    // Método 1
    public void exibirInformacoes() {

        System.out.println("===== PRODUTO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Código: " + codigo);
        System.out.println("Validade: " + validade);
        System.out.println("Fornecedor: " + fornecedor);
        System.out.println("Disponível: " + disponivel);
        System.out.println("Desconto: " + desconto + "%");
    }

    // Método 2
    public void aplicarDesconto(double percentual) {

        desconto = percentual;
        preco = preco - (preco * percentual / 100);

        System.out.println("Desconto aplicado: " + percentual + "%");
        System.out.println("Novo preço: R$ " + preco);
    }

    // Método 3
    public void adicionarEstoque(int quantidadeAdicionar) {

        quantidade = quantidade + quantidadeAdicionar;

        System.out.println("Quantidade adicionada: " + quantidadeAdicionar);
        System.out.println("Estoque atual: " + quantidade);
    }

    // Método 4
    public void verificarDisponibilidade() {

        if (quantidade > 0 && disponivel == true) {
            System.out.println("Produto disponível para venda.");
        } else {
            System.out.println("Produto indisponível para venda.");
        }
    }
}
