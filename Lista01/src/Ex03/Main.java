package Ex03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Criando o objeto
        Produto produto1 = new Produto(
                "Arroz",
                "Alimentos",
                "Tio João",
                25.90,
                10
        );

        // Exibindo as informações
        produto1.exibirInformacoes();

        System.out.println();

        // Aplicando desconto
        produto1.aplicarDesconto(10);

        System.out.println();

        // Adicionando produtos ao estoque
        produto1.adicionarEstoque(5);

        System.out.println();

        // Verificando disponibilidade
        produto1.verificarDisponibilidade();
    }
}
