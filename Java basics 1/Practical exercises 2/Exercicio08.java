public class Exercicio08{
	public static void main(String[] args) {
		int n1, n2, n3;

		System.out.print("Informe o primeiro número: ");
		n1 = Integer.parseInt(System.console().readLine());

		System.out.print("Informe o segundo número: ");
		n2 = Integer.parseInt(System.console().readLine());

		System.out.print("Informe o terceiro número: ");
		n3 = Integer.parseInt(System.console().readLine());

		if(n1 < n2){
			if(n1 < n3){
				System.out.println(n1+" eh o menor valor");
			}else{
				if(n3 < n2){
					System.out.println(n3+" eh o menor valor");
				}else{
					System.out.println(n2+" eh o menor valor");
				}
			}
		}else{
			if(n2 < n3){
				System.out.println(n2+" eh o menor valor");
			}else{
				System.out.println(n3+" eh o menor valor");
			}
		}
	}
}