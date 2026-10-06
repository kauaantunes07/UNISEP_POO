
public class Main {

	public static void main(String[] args) {
	    System.out.print("Boa Noite");
		
		Aluno objeto1 = new Aluno ();
		
		objeto1.nome = "Kauã";
		objeto1.ra = "123456";
		objeto1.valor_mensalidade = 800;
		
		System.out.println("Nome do aluno: " + objeto1.nome);
		System.out.println("RA do Aluno: " + objeto1.ra);
		System.out.println("Valor da mensalidade: " + objeto1.valor_mensalidade);

        objeto1.imprimir_aluno();	
		
        Aluno objeto2 = new Aluno ();
        
		 objeto2.nome = "Felipe";
	     objeto2.ra = "654321";
	     objeto2.valor_mensalidade = 554;
		
		objeto2.imprimir_aluno();
		
	}
		
		

}
