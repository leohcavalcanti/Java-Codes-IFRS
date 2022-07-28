public class Exercicio8{
	public Exercicio8(){
		principal();
	}
	private void principal(){
		int total, op, candUm = 0, candDois = 0, candTres = 0, candQuatro = 0, votoNulo = 0, votoBranco = 0;
		float porceNulo, porceBranco;
		do{
			menu();
			op = Integer.parseInt(System.console().readLine());
			switch(op){
			case 1:
				System.out.print("Voto realizado no candidato 1!");
				candUm++;
				break;
			case 2:
				System.out.print("Voto realizado no candidato 2!");
				candDois++;
				break;
			case 3:
				System.out.print("Voto realizado no candidato 3!");
				candTres++;
				break;
			case 4:
				System.out.print("Voto realizado no candidato 4!");
				candQuatro++;
				break;
			case 5:
				System.out.print("Voto nulo!");
				votoNulo++;
				break;
			case 6:
				System.out.print("Voto em branco!");
				votoBranco++;
				break;
			default:
				System.out.println("Opção inválida!!!");
			}
		}while(op != 0);
		System.out.println("Total de votos \n1, total de "+candUm+"\n2, total de "+candDois+ "\n3, total de "+candTres
			+ "\n4, total de "+candQuatro);
		System.out.println("Total de votos nulos "+votoNulo+"\nTotal de votos em branco");
		total = candUm+candDois+candTres+candQuatro;
		porceNulo = (float)(votoNulo+total)/100;
		porceBranco = (float)(votoBranco+total)/100;
		System.out.println("Percentagem de votos nulos: "+porceNulo);
		System.out.println("Percentagem de votos branco: "+porceBranco);
	}
	private void menu(){
		System.out.println("Votos Canditatos \n1. 2. 3. e 4. \n5. voto nulo \n6. voto em branco");
	}
	public static void main(String[] args) {
		new Exercicio8();
	}
}