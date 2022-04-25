public class Atividade2 {
     public static void main(String[] args) {
		int conte = 1, soma = 0, num;
		while(conte <= 2040){
			System.out.print("Informe os numeors:");
			num = Integer.parseInt(System.console().readLine());
			if(num > 0){
				soma = soma + num;
				conte++;
			}else if( num == 0){
				System.out.println("Somente numeros positivos!");
				break;
			}else{
				System.out.println("Somente numeros positivos!");
				break;
			}
		}
		soma = soma / conte;
		System.out.println("A media eh " +soma);
	}
}