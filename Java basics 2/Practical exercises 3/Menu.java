public class Menu{
	public static void main(String[] args) {
		int option, one, two, sum;
		menu();
		option = Integer.parseInt(System.console().readLine());
		switch(option){
		case 1:System.out.print("Escolha dois números \n1º- número: ");
			one = Integer.parseInt(System.console().readLine());
			System.out.print("2º- número: ");
			two = Integer.parseInt(System.console().readLine());
			sum = one + two;
			System.out.print("valor da some "+sum);
			break;
		case 2:System.out.print("Digite um número: ");
			one = Integer.parseInt(System.console().readLine());
			System.out.print("Valor ao quadrado: "+Math.pow(one,2));
			break;
		}
	}
	public static void menu(){
		System.out.print("Menu de opções: \n1. Somar dois números. \n2. Número ao quadrado. \nDigite a opção desejada: ");
	}
}