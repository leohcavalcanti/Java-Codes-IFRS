public class Exercicio09{
	public static void main(String[] args){
		float area, lado;

		System.out.print("Informe o lado: ");
		lado = Float.parseFloat(System.console().readLine());

		area = lado*lado;
		System.out.printf("Resposta: %.1f",area);
	}
}