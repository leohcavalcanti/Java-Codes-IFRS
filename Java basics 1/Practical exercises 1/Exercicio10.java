public class Exercicio10{
	public static void main(String[] args){
		double pole, pes, jarda, milha;
		int op;

		System.out.print("Medida em pés: ");
		pes = Float.parseFloat(System.console().readLine());
		System.out.println("Qual conversão:\n1-polegadas\n2-jardas\n3-milhas");
		op = Integer.parseInt(System.console().readLine());

		if(op == 1){
			pes = pes*12;
			System.out.printf("pés: %.1f", pes);
		}else if(op == 2){
			jarda = (pes*0.33)+1;
			System.out.printf("jarda: %.1f", jarda);
		}else {
			milha = pes*0.00018939;
			System.out.printf("milha: %.1f", milha);
		}
	}
}