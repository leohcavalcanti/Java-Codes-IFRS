public class Exercicio3{
	public Exercicio3(){
		registrar();
	}
	private void registrar(){
		int somaF = 0, somaM = 0, regis, op = 0, idadeM, idadeF, expM, expF, numCandF = 0, numCandM = 0;
		double mediaF, mediaM;
		char sexo;
		do{
			System.out.println("Cadastra novo candidato: \n1. Sim \n-1. Não");
			regis = Integer.parseInt(System.console().readLine());
			if(regis == 1){
				System.out.println("Cadastra \n1. Feminino \n2. Masculino");
				op = Integer.parseInt(System.console().readLine());
				switch(op){
					case 1:
						sexo = 'F';
						numCandF++;
						System.out.println("Idade: ");
						idadeF = Integer.parseInt(System.console().readLine());
						System.out.println("Tempo de de experiência profissional (em anos): ");
						expF = Integer.parseInt(System.console().readLine());
						if(expF > 0){
							somaF = somaF + idadeF;
						}
						break;
					case 2:
						sexo = 'M';
						numCandM++;
						System.out.println("Idade: ");
						idadeM = Integer.parseInt(System.console().readLine());
						System.out.println("Tempo de de experiência profissional (em anos): ");
						expM = Integer.parseInt(System.console().readLine());
						somaM = somaM + idadeM;
						break;
					default:
						System.out.println("Opção inválida");
				}
			}else{
				continue;
			}
		}while(regis != -1);
		mediaF = somaF / numCandF;
		mediaM = somaM / numCandM;

		System.out.printf("número de candidatos do sexo feminino: %d\n", numCandF);
		System.out.printf("número de candidatos do sexo masculino: %d\n", numCandM);
		System.out.printf("idade média dos homens: %.1f\n", mediaM);
		System.out.printf("idade média das mulheres com experiência: %.1f\n", mediaF);
	}
	public static void main(String[] args) {
		new Exercicio3();
	}
}