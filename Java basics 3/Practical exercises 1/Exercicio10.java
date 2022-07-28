public class Exercicio10{
	public Exercicio10(){
		principal();
	}
	private void principal(){
		int valor;
		System.out.print("Informe um valor maior que 1: ");
		valor = Integer.parseInt(System.console().readLine());
		while(valor < 1){
			System.out.print("Valor inválido!!! \nInforme um novo valor: ");
			valor = Integer.parseInt(System.console().readLine());
		}
		for(int i = 2; i <= valor; i++){
			boolean primo = true;
			for(int j = 2; j < i; j++){
				if(i % j == 0) {
                    primo = false;
                }
			}
			if(primo){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		new Exercicio10();
	}
}