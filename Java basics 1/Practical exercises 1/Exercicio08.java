public class Exercicio08{
	public static void main(String[] args){
		float area, b, a;

		System.out.print("Informe a base: ");
		b = Float.parseFloat(System.console().readLine());
		System.out.print("Informe a altura: ");
		a = Float.parseFloat(System.console().readLine());

		area = (b*a) / 2;
		System.out.printf("Resposta: %.1f", area);
	}
}