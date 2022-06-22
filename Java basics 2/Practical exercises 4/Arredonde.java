import java.math.BigDecimal;
import java.math.RoundingMode;

public class Arredonde{
	double num;
	int dec;
	
	public Arredonde(){
		principal();
	}

	private void principal(){
		System.out.println("Informe o valor do número real: ");
		num = Double.parseDouble(System.console().readLine());
		System.out.println("Informe o valor do número decimal: ");
		dec = Integer.parseInt(System.console().readLine());
		calculo();
		System.out.println(num);
	}

	private void calculo(){
		BigDecimal bd = new BigDecimal(num).setScale(dec, RoundingMode.HALF_UP);
		num = bd.doubleValue();
	}

	public static void main(String[] args) {
		new Arredonde();
	}
}
