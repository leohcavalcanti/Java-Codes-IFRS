public class Exercicio03{
	public static void main(String[] args) {
		int a, b, c, d;

		System.out.print("Informe o valor de A: ");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor de B: ");
		b = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor de C: ");
		c = Integer.parseInt(System.console().readLine());

		d = ((b * b) - (4 * a * c));

		if(d < 0){
			System.out.println("Não possui raízes reais");
		}else if (d > 0) {
			System.out.println("Possui duas raízes reais");
		}else{
			System.out.println("possui uma única raiz real");
		}
	}
}