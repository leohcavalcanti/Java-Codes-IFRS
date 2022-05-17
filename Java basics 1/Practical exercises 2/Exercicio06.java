public class Exercicio06{
	public static void main(String[] args){
		int sn;
		float sal, valPro, add;

		System.out.print("Informe o salário: ");
		sal = Integer.parseInt(System.console().readLine());
		do{
			System.out.print("Informe o preço do produto: ");
		    valPro = Float.parseFloat(System.console().readLine());
			System.out.println("Deseja adicionar comissão?\n1-Sim\n2-Não");
			sn = Integer.parseInt(System.console().readLine());
			add = valPro * 4 / 100;
			sal = sal + add;
	  	}while(sn != 2);
	  	System.out.printf("salário final: %.2f", sal);
	}
}