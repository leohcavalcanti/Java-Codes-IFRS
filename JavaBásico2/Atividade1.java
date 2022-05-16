public class Atividade1{
	public static void main(String[] args){
		int valorUm, valorDois, soma;
		
		while(cont != 10){
			System.out.print("Informe o valor do primeiro: ");
			valorUm = Integer.parseInt(System.console().readLine());
			System.out.print("Informe o valor do segundo: ");
			valorDois = Integer.parseInt(System.console().readLine());
			
			soma = valorUm + valorDois;
			System.out.println("A sooma final = " + soma);
		}
	}
}
