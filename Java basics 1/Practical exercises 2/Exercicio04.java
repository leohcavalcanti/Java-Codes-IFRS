public class Exercicio04{
	public static void main(String[] args){
		Double prod, des;

		System.out.print("Informe o preço do produto: ");
		prod = Double.parseDouble(System.console().readLine());
		des = prod * 10 / 100;
		prod = prod - des;

		System.out.printf("Novo valor do produto: %.2f", prod);
	}
}