class GatoTestDrive{
	public static void main (String[] args){
		
		Gato gato1 = new Gato();
		gato1.nome = "Mia";
		gato1.idadeMeses = 5;
		gato1.sexo = "Fêmea";
		
		Gato gato2 = new Gato();
		gato2.nome = "Simon";
		gato2.idadeMeses = -2;
		gato2.sexo = "Masculino";
		
		Gato gato3 = new Gato();
		gato3.nome = "Dorinha";
		gato3.idadeMeses = 3;
		gato3.sexo = "Fêmea";
		
		gato1.imprimirInformacoes();
		gato1.castracao(gato1.idadeMeses);
		
		gato2.imprimirInformacoes();
		gato2.castracao(gato2.idadeMeses);
		
		gato3.imprimirInformacoes();
		gato3.castracao(gato3.idadeMeses);
		
	}
}