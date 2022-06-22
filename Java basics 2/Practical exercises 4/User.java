import java.math.BigDecimal;
import java.math.RoundingMode;

public class User{
	public User(){
		mensagem();
	}

	private void mensagem(){
		int op;
		do{
			System.out.println("Informe uma opção: ");
			System.out.println("1. O primeiro número elevado ao segundo número.");
			System.out.println("2. Raiz quadrada de cada um dos números");
			System.out.println("3. Raiz cúbica de cada um dos números.");
			System.out.println("0. Para Encerrar!");
			op = Integer.parseInt(System.console().readLine());
			switch(op){
			case 1:
				System.out.println("Resultado "+numENum());
				break;
			case 2:
				System.out.println("Resultado "+raizQ());
				break;
			case 3:
				System.out.println("Resultado "+raizC());
				break;
			case 0:
				System.out.print("Programa encerrado!!!");
				break;
			default:
				System.out.println("Opção invalida!");
			}
		}while(op != 0);
	}

	private double numENum(){
		System.out.println("Informe o valor do primeiro número: ");
		int numUm = Integer.parseInt(System.console().readLine());
		System.out.println("Informe o valor do segundo número: ");
		int numDois = Integer.parseInt(System.console().readLine());
		double resul = Math.pow(numUm, numDois);
		return resul;
	}
	private double raizQ(){
		System.out.println("Informe o valor o número: ");
		int num = Integer.parseInt(System.console().readLine());
		double resul = Math.sqrt(num);
		BigDecimal bd = new BigDecimal(resul).setScale(2, RoundingMode.HALF_UP);
		resul = bd.doubleValue();
		return resul;
	}
	private double raizC(){
		System.out.println("Informe o valor o número: ");
		int num = Integer.parseInt(System.console().readLine());
		double resul = Math.cbrt(num);
		BigDecimal bd = new BigDecimal(resul).setScale(2, RoundingMode.HALF_UP);
		resul = bd.doubleValue();
		return resul;
	}
	public static void main(String[] args) {
		new User();
	}
}