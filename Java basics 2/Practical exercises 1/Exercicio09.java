public class Exercicio09{
	public static void main(String[] args) {
		double sal, novSal, aumento = 30;

		System.out.print("Informe o valor do salário: ");
		sal = Double.parseDouble(System.console().readLine());
		if(sal < 5.000){
			novSal = sal * aumento / 100;
			System.out.printf("Novo salário com aumento: %f",novSal);
		}else {
			System.out.println("Salário não recebe aumento.");
		}

	}
}