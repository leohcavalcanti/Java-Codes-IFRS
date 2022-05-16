public class Exercicio05{
	public static void main(String[] args) {
		int n1, n2, n3, n4, a, b, c, d, res;

		System.out.print("Informe o primeiro número: ");
		n1 = Integer.parseInt(System.console().readLine());
		a = n1 % 2;		
		
		if(a == 2){
			System.out.println("A eh par");
		}else{
			System.out.println("A eh impar");
		}
		System.out.print("Informe o segundo número: ");
		n2 = Integer.parseInt(System.console().readLine());
		b = n1 % 2;
		
		if(b == 2){
			System.out.println("A eh par");
		}else{
			System.out.println("A eh impar");
		}

		System.out.print("Informe o terceiro número: ");
		n3 = Integer.parseInt(System.console().readLine());
		c = n3 % 2;

		if(c == 2){
			System.out.println("A eh par");
		}else{
			System.out.println("A eh impar");
		}

		System.out.print("Informe o quarto número: ");
		n4 = Integer.parseInt(System.console().readLine());
		d = n4 % 2;

		if(d == 2){
			System.out.println("A eh par");
		}else{
			System.out.println("A eh impar");
		}

	}
}