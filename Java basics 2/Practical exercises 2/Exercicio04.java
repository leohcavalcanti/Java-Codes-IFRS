public class Exercicio04{
	public static void main(String[] args) {
		int a, b, c, i, j, k;

		System.out.print("Informe o valor de A: ");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor de B: ");
		b = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor de C: ");
		c = Integer.parseInt(System.console().readLine());


		i = b+c;
		j = a+c;
		k = a+b;

		if(i > a){
			System.out.println("O lado A formam um triângulo");
			if(j > b){
				System.out.println("O lado B formam um triângulo");
				if(k > c){
					System.out.println("O lado C formam um triângulo");
				}else{
					System.out.println("O valor informado de C não podem formar um triângulo");
				}
			}else{
				System.out.println("O valor informado de B não podem formar um triângulo");
			}
		}else{
			System.out.println("O valor informado de A não podem formar um triângulo");
		}
	}
}