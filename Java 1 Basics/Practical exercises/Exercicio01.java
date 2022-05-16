public class Exercicio01{
	public static void main(String[] args){
		int N1, N2, RES;

		System.out.println("Informe o primeiro número: ");
		N1 = Integer.parseInt(System.console().readLine());
		System.out.println("Informe o segundo número: ");
		N2 = Integer.parseInt(System.console().readLine());

		RES = N1 - N2;
		System.out.println("Resposta: "+RES);
	}
}
