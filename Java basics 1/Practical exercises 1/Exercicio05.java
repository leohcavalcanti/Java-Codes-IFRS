public class Exercicio05{
	public static void main(String[] args){
		float salBase, novoSal, grat, imposto;

		System.out.print("Informe o salário de um funcionário: ");
		salBase = Float.parseFloat(System.console().readLine());
		grat = salBase * 5 / 100;
		salBase = salBase + grat;
		imposto = salBase * 7 / 100;
		novoSal = salBase - imposto;

		System.out.printf("Gratificação: %.2f", grat);
		System.out.println("");
		System.out.printf("Imposto: %.2f", imposto);
		System.out.println("");
		System.out.printf("Novo salário: %.2f", novoSal);
	}
}