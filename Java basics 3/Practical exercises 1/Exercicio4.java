public class Exercicio4{
	public Exercicio4(){
		funcionario();
	}
	private void funcionario(){
		int numFunc;
		System.out.println("Informe o número de funcionario: ");
		numFunc = Integer.parseInt(System.console().readLine());
		calImposto(numFunc);
	}
	private void calImposto(int numFunc){
		int cont = 0;
		double salario, soma;
		while(cont <= numFunc){
			System.out.println("Informe o salário: ");
			salario = Double.parseDouble(System.console().readLine());
			salario = impostoRenda(salario);
			salario = inss(salario);
			//Plano de saúde
			soma = (salario * 4.5)/100;
			salario = salario - soma;
			System.out.printf("Salário liquido: %.2f\n",salario);
			cont++;
		}
	}
	private double impostoRenda(double salario){
		double sal;
		if(salario >= 1903.98 && salario <= 2826.65){
			sal = (salario * 7.5)/100;
			sal = salario - sal;
			return sal;
		}else if(salario >= 2826.66 && salario <= 3751.05){
			sal = (salario * 15)/100;
			sal = salario - sal;
			return sal;
		}else if(salario >= 3751.06 && salario <= 4664.68){
			sal = (salario * 22.5)/100;
			sal = salario - sal;
			return sal;
		}else if(salario > 4664.68){
			sal = (salario * 22.5)/100;
			sal = salario - sal;
			return sal;
		}else{
			return salario;
		}
	}
	private double inss(double salario){
		double sal;
		if(salario >= 1693.73 && salario <= 2822.90){
			sal = (salario * 9)/100;
			sal = salario - sal;
			return sal;
		}else if(salario > 2822.90){
			sal = (salario * 11)/100;
			sal = salario - sal;
			return sal;
		}else{
			sal = (salario * 8)/100;
			sal = salario - sal;
			return sal;
		}
	}
	public static void main(String[] args) {
		new Exercicio4();
	}
}