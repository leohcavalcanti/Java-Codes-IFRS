public class SumOfSquares {
     public static void main(String[] args) {
		int count = 0, number;
		double sum = 0;
		System.out.println("Digite 0 para Parar");
		while(count <= 2040){
			System.out.print("Informe os numeros:");
			number = Integer.parseInt(System.console().readLine());
			if(number > 0){
				sum = sum + number;
				count++;
			}else{
				break;
			}
		}
		sum = sum / count;
		System.out.println("A media eh " +sum);
	}
}