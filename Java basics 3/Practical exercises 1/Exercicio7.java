public class Exercicio7{
	public Exercicio7(){
		principal();
	}
	private void principal(){
		int op;
		menu();
		op = Integer.parseInt(System.console().readLine());
		switch(op){
		case 1:
			System.out.print("Média Aritmética: "+aritmetica());
			break;
		case 2:
			System.out.print("Média Ponderada: "+ponderada());
			break;
		case 3:
			break;
		default:
			System.out.print("Opção inválida!!!");
		}
	}
	private float aritmetica(){
		float notaUm, notaDois, media;

		System.out.print("Informe a primera nota: ");
		notaUm = Float.parseFloat(System.console().readLine());
		System.out.print("Informe a segunda nota: ");
		notaDois = Float.parseFloat(System.console().readLine());

		media = (notaUm + notaDois)/2;
		return media;
	}
	private float ponderada(){
		float notaUm, notaDois, notaTres, notaQuatro, somaNota;
		int pesoUm, pesoDois, pesoTres, pesoQuatro, somaPeso;
		System.out.print("Informe a nota 1: ");
		notaUm = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso 1: ");
		pesoUm = Integer.parseInt(System.console().readLine());
		System.out.print("Informe a nota 2: ");
		notaDois = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso 2: ");
		pesoDois = Integer.parseInt(System.console().readLine());
		System.out.print("Informe a nota 3: ");
		notaTres = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso 3: ");
		pesoTres = Integer.parseInt(System.console().readLine());
		System.out.print("Informe a nota 4: ");
		notaQuatro = Float.parseFloat(System.console().readLine());
		System.out.print("Informe o peso 4: ");
		pesoQuatro = Integer.parseInt(System.console().readLine());
		somaPeso = pesoUm+pesoDois+pesoTres+pesoQuatro;
		somaNota = (float)(notaUm+notaDois+notaTres+notaQuatro)/somaPeso;
		return somaNota;
	}
	private void menu(){
		System.out.println("1. Média Aritmética \n2. Média Ponderada \n3. Sair");
	}
	public static void main(String[] args) {
		new Exercicio7();
	}
}