public class Exercicio07{
	public static void main(String[] args){
		float N1, N2, N3, somaP, RES;
		int P1, P2, P3;

		System.out.print("Informe a primeira nota: ");
		N1 = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso: ");
		P1 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe a segunda nota: ");
		N2 = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso: ");
		P2 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe a terceira nota: ");
		N3 = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso: ");
		P3 = Integer.parseInt(System.console().readLine());

		somaP = P1 + P2 + P3;
		RES = ((N1*(float)P1)+(N2*(float)P2)+(N3*(float)P3)) / somaP;
		 
		System.out.printf("Nota final: %.1f", RES);
	}
}