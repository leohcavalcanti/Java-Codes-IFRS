public class Sum{
	public static void main(String[] args){
		int valueOne, valueTwo, sum, cont = 0;
		
		while(cont != 10){
			System.out.print("Informe o valor do primeiro: ");
			valueOne = Integer.parseInt(System.console().readLine());
			System.out.print("Informe o valor do segundo: ");
			valueTwo = Integer.parseInt(System.console().readLine());
			
			sum = valueOne + valueTwo;
			System.out.println("A sooma final = " + sum);
			cont++;
		}
	}
}