public class Exercicio05{
	int[] numeros = new int[20];
	public Exercicio05(){
		principal();
	}
	private void principal(){
		int maior = 0;
		for(int i = 0; i <= numeros.length; i++){
			System.out.printf("Informe o valor do %d: ",i);
			numeros[i] = Integer.parseInt(System.console().readLine());
			if(i == 0){
				maior = numeros[i];
			}else{
				if(numeros[i] > maior){
					maior = numeros[i];
				}
			}
		}
		System.out.println("o MAIOR E " + maior);
		for(int i = 0; i < numeros.length; i++){
			numeros[i] = numeros[i] / maior;
			System.out.print(numeros[i] + " ");
		}
	}
	public static void main(String[] args) {
		new Exercicio05();
	}
}