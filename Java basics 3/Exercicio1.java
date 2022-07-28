public class Exercicio1{
	public Exercicio1(){
		dados();
	}

	private void dados(){
		Integer idadeMaior = null, idadeMenor = null;

		int idade, quat = 0, quatM = 0;
		double salario = 0.0, mediaSal, somaSal = 0;
		char sexo, sexoMenor = ' ';

		do{
			System.out.println("Informe a idade: ");
			idade = Integer.parseInt(System.console().readLine());
			if(idade < 0){
				break;
			}
			System.out.println("Informe o sexo: \nM. Masculino \nF. Feminino");
			sexo = System.console().readLine().charAt(0);
			if(idadeMaior == null && idadeMenor == null){
				idadeMaior = idade;
				idadeMenor = idade;
			}else if(idade > idadeMaior){
				idadeMaior = idade;
			}else if(idade < idadeMenor){
				idadeMenor = idade;
				sexoMenor = sexo;
			}else{

			}
			System.out.println("Informe o salario: ");
			salario = Double.parseDouble(System.console().readLine());
			if(salario == 1.500 && sexo == 'F'){
				quatM++;
			}

			somaSal = somaSal + salario;
			quat++;
		}while(idade >= 0);
		mediaSal = somaSal / quat;
		System.out.println("Média de salário: "+mediaSal);
		System.out.println("Maior idade :"+idadeMaior+ " idade menor: "+idadeMenor);
		System.out.println("Quantidades de mulheres com salário até 1500.00: "+quatM);
		System.out.println("Pessoa que possui o menor salário: \nidade: "+idadeMenor+ "\nsexo: "+sexoMenor);
	}
	public static void main(String[] args) {
		new Exercicio1();
	}
}
