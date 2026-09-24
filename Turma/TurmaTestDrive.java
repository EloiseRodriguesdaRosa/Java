class TurmaTestDrive{
	public static void main(String[] args){
		
		Turma turma1 = new Turma();
		turma1.turmaIdentificador = "A";
		turma1.periodo = "Matutino";
		int idadeTurma1[] = {12, 11, 12, 11, 11};
		
		Turma turma2 = new Turma();
		turma2.turmaIdentificador = "G";
		turma2.periodo = "Noturno";
		int idadeTurma2[] = {14, 13, 15, 15, 14};
		
		
		turma1.imprimirInformacoes(turma1.turmaIdentificador, turma1.periodo);
		turma1.percorrerIdadeAlunos(idadeTurma1);
		
		turma2.imprimirInformacoes(turma2.turmaIdentificador, turma2.periodo);
		turma2.percorrerIdadeAlunos(idadeTurma2);
		
	}
}