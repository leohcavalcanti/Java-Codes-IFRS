public class Exercicio04{
	int sub,somaSub = 0, valor1, valor2;
	int[] numInt1 = new int[5];
	int[] numInt2 = new int[5];
	public Exercicio04(){
		principal();
	}
	private void principal(){
		for(int i = 1; i <= numInt1.length; i++){
			System.out.printf("Digite o valor do vetor 1 %d: ",i);
			valor1 = Integer.parseInt(System.console().readLine());
			numInt1[i-1] = valor1;
			System.out.printf("Digite o valor do vetor 2 %d: ",i);
			valor2 = Integer.parseInt(System.console().readLine());
			numInt2[i-1] = valor2;
		}
		for(int a = 0; a <= 4; a++){
			for(int b = 4; b >= 0; b--){
				sub = numInt1[a] - numInt2[b];
				somaSub += sub;
				
			}
		}
		System.out.printf("Resultado: %d\n",sub);
	}
	public static void main(String[] args) {
		new Exercicio04();
	}
}