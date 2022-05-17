public class Exercicio03{
	public static void main (String[] args){
		Double N1, N2, N3, RES;

		System.out.print("Informe a primeira nota: ");
		N1 = Double.parseDouble(System.console().readLine());
		System.out.print("Informe a segunda nota: ");
		N2 = Double.parseDouble(System.console().readLine());
		System.out.print("Informe a terceira nota: ");
		N3 = Double.parseDouble(System.console().readLine());

		RES = (N1+N2+N3) / 3;

		System.out.printf("Resposta: %.1f", RES);
	}
}