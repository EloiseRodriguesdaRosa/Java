class Turma{
	String turmaIdentificador;
	String periodo;
	
	void percorrerIdadeAlunos(int[] idadeAlunos){
		for (int idade : idadeAlunos){
			System.out.println(idade);
		}
	}
	
	void imprimirInformacoes(String turmaIdentificador, String periodo){
		System.out.println("Turma: "+turmaIdentificador+"\nPeríodo: "+periodo);
	}
}