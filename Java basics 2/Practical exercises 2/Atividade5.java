public class Atividade5 {
     public static void main(String[] args) {
		int litros, distancia, soma = 0, conte = 0;
		
		System.out.print("Informe a quatidade de combustivel: ");
		litros = Integer.parseInt(System.console().readLine());
		
		do{
			System.out.print("Informe a distancia percorrida: ");
			distancia = Integer.parseInt(System.console().readLine());
			conte++;
			soma = soma + distancia;
		}while(distancia != 0);
		conte -= 1;
		System.out.println("A media da distancia eh: " +soma / conte);
     }
}