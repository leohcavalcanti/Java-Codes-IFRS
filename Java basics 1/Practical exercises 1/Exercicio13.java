public class Exercicio13{
	public static void main(String[] args) {
		double horasTrab, salMin, valHoraTrab, salBruto, imposto, salReceber;
		
		System.out.print("Informe as horas trabalhadas: ");
		horasTrab = Double.parseDouble(System.console().readLine());
		System.out.print("Informe o salário mínimo: ");
		salMin = Double.parseDouble(System.console().readLine());

		valHoraTrab = salMin / 10;
		salBruto = horasTrab * valHoraTrab;
		imposto = salBruto * 3 / 100;
		salReceber = salBruto - imposto;

		System.out.printf("Salário: %.2f",salReceber);

	}
}