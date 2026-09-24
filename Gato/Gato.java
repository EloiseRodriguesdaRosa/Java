class Gato{
	
	String nome;
	int idadeMeses;
	String sexo;
	
	void castracao(int idadeMeses){
	
		if (idadeMeses < 0 || idadeMeses > 240){
			System.out.println("Idade inválida.\n");
		} else if (idadeMeses >= 5){
			System.out.println("Pode ser castrado.\n");
		} else {
			System.out.println("Animal muito novo.\n");
		}
		
	}
	
	void imprimirInformacoes(){
		System.out.println("Nome: " + nome + "\nIdade em meses: " + idadeMeses + "\nSexo: " + sexo);
	}
}