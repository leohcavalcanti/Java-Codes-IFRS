public class Exercicio13{
	int notaCiquenta = 100, notaDez = 100, notaCinco = 100, notaUm = 100;
 	double resto, saldo;
	public Exercicio13(){
		principal();
	}
	private void principal(){
 		do{
 			System.out.println("Caixa Eletrônicos \nInforme o valor a ser sacado: ");
 			saldo = Double.parseDouble(System.console().readLine());
 			while(saldo < 0){
 				System.out.println("Valor inválidor!!!\nInforme o valor:");
 				saldo = Double.parseDouble(System.console().readLine());
 			}
 			saque();
 		}while(saldo == 0);
 		
	}
	private void saque(){
		if(notaCiquenta == 0 || notaDez == 0 || notaCinco == 0 || notaUm == 0){
			if(notaCiquenta == 0){
				System.out.println("Nota de ciquenta acabou!");
			}else if(notaDez == 0){
				System.out.println("Nota de dez acabou!");
			}else if(notaCinco == 0){
				System.out.println("Nota de cinco acabou!");
			}else{
				System.out.println("Nota de um acabou!");
			}
		}
		if((resto = saldo % 50) == 0){
			notaCiquenta--;
			saldo -= 50;
		}
		else if((resto = saldo % 10) == 0){
			notaDez--;
			saldo -= 10;
		}
		else if((resto = saldo % 5) == 0){
			notaCinco--;
			saldo -= 5;
		}
		else if((resto = saldo % 1) == 0){
			notaUm--;
			saldo -= 1;
		}
		if(saldo != 0){
			saque();
		}else{
			System.out.println("Restam: "+notaCiquenta+" notas de R$50, "+notaDez+" notas de R$10, "+notaCinco+" notas de R$5, "+notaUm+" notas de R$1");
		}
	}
	public static void main(String[] args) {
		new Exercicio13();
	}
}