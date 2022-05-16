public class Atividade3{
	public static void main(String[] args){
		int num;
		for(;;){
			System.out.print("Digite os numero: ");
			num = Integer.parseInt(System.console().readLine());
			if(num > 0){
				System.out.println("O quadrado de "+num+ " eh " +Math.pow(num,2));
			}else{
				System.out.println("Numero nao eh positivo!");
			}
		}
	}
}
