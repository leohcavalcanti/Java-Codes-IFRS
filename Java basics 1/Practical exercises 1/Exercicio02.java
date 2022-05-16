public class Exercicio02{
	public static void main(String[] args){
		int N1, N2, RES;

		System.out.println("Informe o primeiro número: ");
		N1 = Integer.parseInt(System.console().readLine());
		do{
			System.out.println("Informe o segundo número: ");
			N2 = Integer.parseInt(System.console().readLine());
		}while(N2 == 0);
		
		RES = N1 / N2;
		System.out.println("Resposta: "+RES);
	}
}