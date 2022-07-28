public class Exercicio6{
	String nome, matricula;
	float nota, soma = 0, media;
	char notaLetras;
	int cont = 0;
	public Exercicio6(){
		aluno();
	}
	private void aluno(){
		int numeroAluno;
		System.out.print("Quantos alunos há ser cadastrado: ");
		numeroAluno = Integer.parseInt(System.console().readLine());
		while(numeroAluno > 0){
			cadastrar();
			numeroAluno--;
		}
		media = (soma*cont)/100;
		System.out.printf("Quanatidade de alunos: %d\n",cont);
		System.out.print("Média de notas dos alunos: "+media);
	}
	private void cadastrar(){
		nome();
		matricula();
		notas();
	}
	private void nome(){
		System.out.print("Nome do Aluno: ");
		nome = System.console().readLine();
		boolean verificaNome = nome.matches("[a-zA-Z]*");
		if(verificaNome == false){
			System.out.println("Nome Inválida!!!");
			nome();
		}
		
	}
	private void matricula(){
		System.out.print("Numéro da matrícula do aluno: ");
		matricula = System.console().readLine();
		boolean verificaMatricula = matricula.chars().allMatch(Character::isDigit);
		if(verificaMatricula == false){
			System.out.println("Matrícula Inválida!!!");
			matricula();
		}
	}
	private void notas(){
		System.out.print("Nota final do Aluno: ");
		nota = Float.parseFloat(System.console().readLine());
		if(nota >= 0.0 || nota <= 2.9){
			notaLetras = 'E';
		}else if(nota >= 3.0 || nota <= 4.9){
			notaLetras = 'D';
		}else if(nota >= 5.0 || nota <= 6.9){
			notaLetras = 'C';
		}else if(nota >= 7.0 || nota <= 8.9){
			notaLetras = 'B';
		}else{
			notaLetras = 'A';
		}
		cont++;
		soma = soma + nota;
	}
	public static void main(String[] args) {
		new Exercicio6();
	}
}