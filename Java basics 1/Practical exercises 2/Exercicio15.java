public class Exercicio15{
	public static void main(String[] args) {
		double cel, fah;

		System.out.print("Informe a temperatura: ");
		cel = Double.parseDouble(System.console().readLine());

		fah = ((9 * cel) / 5) + 32;

		System.out.printf("Resposta: %.2f",fah);
	}
}