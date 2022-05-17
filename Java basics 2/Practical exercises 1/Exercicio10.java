public class Exercicio10{
	public static void main(String[] args) {
		float trabalho, avaliacao, exame, 
		peso1 = 2, peso2 = 3, peso3 = 5, cal, somaP;

		System.out.print("Informe a 1º nota: ");
		trabalho = Float.parseFloat(System.console().readLine());

		System.out.print("Informe a 2º nota: ");
		avaliacao = Float.parseFloat(System.console().readLine());		
	
		System.out.print("Informe a 3º nota: ");
		exame = Float.parseFloat(System.console().readLine());
	
		somaP = peso1 + peso2 + peso3;
		cal = ((trabalho * peso1) + (avaliacao * peso2) + (exame * peso3)) / somaP;

		if (cal >= 8 && cal <= 10) 
			System.out.println("Nota final: A");
		if (cal >= 7 && cal <= 8)
			System.out.println("Nota Final B");
		if (cal >= 6 && cal <= 7)
			System.out.println("Nota Final C");
		if (cal >= 5 && cal <= 6)
			System.out.println("Nota Final D");
		if (cal >= 0 && cal <= 5)
			System.out.println("Nota Final E");
	}
}