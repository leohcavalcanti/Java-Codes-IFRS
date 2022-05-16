public class Exercicio11{
	public static void main(String[] args){
		int ano, meses, semana, dias, anoAtual, anoNas;

		System.out.print("Informe o ano nascido: ");
		anoNas = Integer.parseInt(System.console().readLine());
		System.out.print("Informe a ano atual: ");
		anoAtual = Integer.parseInt(System.console().readLine());

		ano = anoAtual - anoNas;
		meses = ano * 12;
		semana = ano * 52;
		dias = ano * 3651 / 4;

		System.out.println("Idade da pessoa em anos: "+ano);
		System.out.println("Idade da pessoa em meses: "+meses);
		System.out.println("Idade da pessoa em semanas: "+semana);
		System.out.println("Idade da pessoa em dias: "+dias);

	}
}