public class Atividade4{
	public static void main(String[] args){
		int num, soma = 0, conte = 0;
		do{
			System.out.print("Digite os numeros: ");
			num = Integer.parseInt(System.console().readLine());
			conte++;
			soma = soma + num;
		}while(num != 0);
		conte -= 1;
		System.out.println("A media eh: " +soma/conte);
	}
}