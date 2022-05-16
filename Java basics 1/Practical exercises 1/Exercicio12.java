public class Exercicio12{
	public static void main(String[] args) {
		double precoF, lucroDist, precoFN, porLucro, porImposto;

		System.out.print("Informe o preço de fábrica: ");
		precoF = Double.parseDouble(System.console().readLine());
		System.out.print("Informe o percentual de lucro: ");
		porLucro = Double.parseDouble(System.console().readLine());
		System.out.print("Informe o percentual do imposto: ");
		porImposto = Double.parseDouble(System.console().readLine());

		porLucro = precoF * porLucro / 100;
		porImposto = precoF * porImposto / 100;
		precoF = precoF + porImposto;
		lucroDist = precoF + porLucro;
		precoFN = precoF + lucroDist;

		System.out.printf("Valor correspondente ao lucro do distribuidor: %.2f",porLucro);
		System.out.println("");
		System.out.printf("Valor correspondente aos impostos: %.2f",porImposto);
		System.out.println("");
		System.out.printf("Preço final do produto: %.3f",precoFN);
	}
}