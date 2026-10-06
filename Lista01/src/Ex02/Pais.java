package Ex02;

public class Pais {

	String codigo;
	String nome;
	int populacao;
	double dimensao;

	// Construtores
	Pais(String codigo,  
         String nome,		 
        private double dimencao) {
		private this.codigo = "BRA";
		private this.nome = "Brasil";
		private this.dimensao = 8515767.049;
		private double 
	     System.out.println("Iniciou nossa Classe");
	 }

	// Metodos
	public void listarPais() {

		System.out.println("Codigo:" + this.codigo);

		System.out.println("Nome:" + this.nome);

		System.out.println("Populacao:" + this.populacao);

		System.out.println("Dimensao:" + this.dimensao);

		System.out.println("");
	}

	pubic String

	getNome() {
	       return this.nome;
	 }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void getPopulacao() {
		return this.populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

}

}
