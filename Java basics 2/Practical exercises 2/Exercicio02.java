public class Exercicio02{
	public static void main(String[] args) {
		int num;

		System.out.print("Informe um número: ");
		num = Integer.parseInt(System.console().readLine());

		if(num > 0 && num < 9){
			System.out.println("O valor está na faixa permitida");
		}else {
			System.out.println("O valor está fora da faixa permitida");
		}
	}
}