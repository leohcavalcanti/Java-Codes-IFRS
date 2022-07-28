public class Exercicio5{
	char sexo;
	int olhos, idade, op, idadeCont = 0, pesoCont = 0, alturaCont = 0, olhoAzulCont = 0, caleboRuivoCont = 0, sexoMCont = 0, sexoFCont = 0;
	float altura, peso, cabelo, sexoM, sexoF, mediaIdade, mediaPeso, mediaAltura, mediaAzul, mediaRuivo;
	public Exercicio5(){
		pesquisa();
	}
	private void pesquisa(){
		do{
			sexo();
			olho();
			cabelo();
			System.out.print("Idade: ");
			idade = Integer.parseInt(System.console().readLine());
			idadeCont++;
			System.out.print("Altura: ");
			altura = Float.parseFloat(System.console().readLine());
			alturaCont++;
			System.out.print("Peso: ");
			peso = Float.parseFloat(System.console().readLine());
			pesoCont++;
			System.out.print("Deseja adicionar novo pessoa: \n1. Sim \n-1. Não");
			op = Integer.parseInt(System.console().readLine());
		}while(op != -1);
		//Porcentagem
		sexoM = sexoMCont / 100;
		sexoF = sexoFCont / 100;
		//Media
		mediaAzul = (caleboRuivoCont*caleboRuivoCont)/100;
		mediaRuivo = (olhoAzulCont*olhoAzulCont)/100;
		mediaIdade = (idadeCont*idadeCont)/100;
		mediaPeso = (pesoCont*pesoCont)/100;
		mediaAltura = (alturaCont*alturaCont)/100;
		System.out.printf("Porcentagem de \nmulheres: %0.1f\n \nhomens: %0.1f\n",sexoF ,sexoM);
		System.out.println("Medias: ");
		System.out.printf("Olhos Azuis: %0.1f\n", mediaAzul);
		System.out.printf("Cabelos Ruivos: %0.1f\n", mediaRuivo);
		System.out.printf("Idade: %0.1f\n", mediaIdade);
		System.out.printf("Peso: %0.1f\n", mediaPeso);
		System.out.printf("Altura: %0.1f\n", mediaAltura);

	}
	private void sexo(){
		System.out.print("sexo: ");
		sexo = System.console().readLine().charAt(0);
		if(sexo == 'M'){
			sexoMCont++;
		}else{
			sexoFCont++;
		}
		while(sexo != 'M' && sexo != 'F'){
			System.out.println("Erro! Informação do sexo incorreto!!!");		
			System.out.print("Informe novamente o sexo: ");
			sexo = System.console().readLine().charAt(0);
		}
	}
	private void olho(){
		System.out.println("Cor dos olhos: 1-azul, 2-verdes, 3-castanhos");
		olhos = Integer.parseInt(System.console().readLine());
		if(olhos == 1){
			olhoAzulCont++;
		}
		while(olhos != 1 && olhos != 2 && olhos != 3) {
			System.out.println("Erro! Informação do olhos incorreto!!!");
			System.out.println("Cor dos olhos: 1-azul, 2-verdes, 3-castanhos");
			olhos = Integer.parseInt(System.console().readLine());
		}
	}
	private void cabelo(){
		System.out.println("Cor dos olhos L-Louros, C-castanhos, P-pretos, R-ruivos");
		cabelo = System.console().readLine().charAt(0);
		if(cabelo == 'R'){
			caleboRuivoCont++;
		}
		while(cabelo != 'L' && cabelo != 'C' && cabelo != 'P' && cabelo != 'R'){
			System.out.println("Erro! Informação do cabelo incorreto!!!");
			System.out.println("Cor dos olhos L-Louros, C-castanhos, P-pretos, R-ruivos");
			cabelo = System.console().readLine().charAt(0);
		}
	}
	public static void main(String[] args) {
		new Exercicio5();
	}
} 