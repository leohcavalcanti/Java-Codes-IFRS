public class Exercicio02{
	int[] guardaValores = new int[5];
	int cont, numero, soma;
	public Exercicio02(){
		principal();
	}
	private void principal(){
		for(cont = 1; cont <= 5; cont++){
			System.out.printf("Digite o %d número: ",cont);
			numero = Integer.parseInt(System.console().readLine());
			guardaValores[cont-1] = numero;
		}
		System.out.println("Os número digitados foram:");
		soma = guardaValores[0] + guardaValores[1] + guardaValores[2] + guardaValores[3] + guardaValores[4];
		System.out.printf("%d + %d + %d + %d + %d = %d",guardaValores[0], guardaValores[1], guardaValores[2], guardaValores[3], guardaValores[4], soma);
	}
	public static void main(String[] args) {
		new Exercicio02();
	}
}