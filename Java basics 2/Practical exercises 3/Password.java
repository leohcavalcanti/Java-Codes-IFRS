import java.util.Arrays;

public class Password {
	public static void main(String[] args) {
		int valueOne, valueTwo, count = 1, option;
		int regis[] = new int[3];
		boolean checkReturn = false;
		
		do{
		System.out.println("Você deseja Cadastra um senha \n1- para SIM \n2- para NÃO \n0- para Encerrar");
		option = Integer.parseInt(System.console().readLine());

		switch (option) {
			case 1:System.out.println("Registe quatro digito para a senha");
				for (int i = 0; i != 4;i++) {
					System.out.print("Digite o " + count + "º número: ");
					valueOne = Integer.parseInt(System.console().readLine());
					passwordRegis(valueOne, regis);
					count++;
				}
				break;
			case 2:System.out.println("Digite a sua senha!");
			for(int i = 0; i != 4;i++){
				count = 1;
				System.out.print("Digite o "+count+" º número: ");
				valueTwo = Integer.parseInt(System.console().readLine());
				checkReturn = checkPassword(valueTwo, regis);
				count++;
			}
			if(checkReturn == true){
				System.out.println("Senha correta, acesso liberado.");
				option = 0;
			}else{
				System.out.println("Senha errada, acesso negado.");
			}
			break;
		case 0:
			System.out.println("Código Encerrado");
			break;
		default:System.out.println("Opção inválida!");
		}
	}while(option != 0);
}

	private static void passwordRegis(int value, int regis[]) {
		int i = 0;
		regis[i] = value;
		i++;
	}

	private static boolean checkPassword(int value, int regis[]) {
		int i = 0;
		int number[] = new int[3];
		number[i] = value;
		i++;

		for(int a = 0; a < regis.length;a++){
			for(int b = 0; b < number.length;b++){
				if(Arrays.equals(regis, number)){
					return true;
				}
			}
		}
		return false;
	}
}