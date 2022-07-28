public class Exercicio9{
	public Exercicio9(){
		principal();
	}
	private void principal(){
		int op, tempo;
		double salario, sal, decimo;
		System.out.println("Informe o salário: ");
		salario = Double.parseDouble(System.console().readLine());

		menu();
		op = Integer.parseInt(System.console().readLine());
		switch(op){
		case 1:
			sal = aumentos(salario);
			System.out.printf("Aumento salário: %.2f\n",sal);
			break;
		case 2:
			sal = salario+(salario/3);
			System.out.printf("Ferias = %.2f",sal);
			break;
		case 3:
			System.out.println("número de meses de trabalho na empresa: ");
			tempo = Integer.parseInt(System.console().readLine());
			while(tempo > 12){
				System.out.println("Número inválido!!! \nInforme novamente o meses: ");
				tempo = Integer.parseInt(System.console().readLine());
			}
			decimo = (salario * tempo)/12;
			System.out.printf("Décimo terceiro: %.2f",decimo);
			break;
		case 4:
			System.out.println("Fim!!!");
			break;
		}
	}
	private double aumentos(double salario){
		double sal;
		if(salario <= 1000.00){
			sal = (salario*15)/100;
			salario = salario + sal;
		}else if(salario >= 1000.01 || salario <= 3000.00){
			sal = (salario*10)/100;
			salario = salario + sal;
		}else {
			sal = (salario*5)/100;
			salario = salario + sal;
		}
		return salario;
	}
	private void menu(){
		System.out.println("1. Novo Salário \n2. Férias \n3. Décimo terceiro \n4. Sair");
	}
	public static void main(String[] args) {
		new Exercicio9();
	}
}