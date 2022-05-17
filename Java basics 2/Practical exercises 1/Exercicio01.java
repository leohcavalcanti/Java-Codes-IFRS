public class Exercicio01{
	public static void main(String[] args) {
		int N1, N2;

		System.out.print("Informe o primeiro número: ");
		N1 = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o segundo número: ");
		N2 = Integer.parseInt(System.console().readLine());

		if(N1 > N2){
			System.out.println("O PRIMEIRO número é MAIOR");
		}else if (N2 > N1){
			System.out.println("O SEGUNDO número é MAIOR");
		}else{
			System.out.println("Os número são IGUAIS");
		}
	}
}
