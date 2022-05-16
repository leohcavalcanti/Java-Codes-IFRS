public class Exercicio14{
	public static void main(String[] args) {
		double quilowatt, salMin, qtdQuilowatts, valResi, valFinal;

		System.out.print("Quilowatts consumida: ");
		qtdQuilowatts = Double.parseDouble(System.console().readLine());
		System.out.print("Informe o salário mínimo: ");
		salMin = Double.parseDouble(System.console().readLine());

		quilowatt = salMin * 20 / 100;
		valResi = qtdQuilowatts * quilowatt;
		valFinal = valResi * 15 / 100;

		System.out.printf("valor final: %.2f",valFinal);
	}
}