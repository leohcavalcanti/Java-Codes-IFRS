public class Fuel {
     public static void main(String[] args) {
		int liter, distance, sum = 0, count = 0;
		
		System.out.print("Informe a quatidade de combustivel: ");
		liter = Integer.parseInt(System.console().readLine());
		
		do{
			System.out.print("Informe a distancia percorrida: ");
			distance = Integer.parseInt(System.console().readLine());
			count++;
			sum = sum + distance;
		}while(distance != 0);
		count -= 1;
		System.out.println("A media da distancia eh: " +sum / count);
     }
}