public class Baskara{
		int a, b, c;
		double d, xisM, xisMe;
	public Baskara(){
		principal();
	}

	private void principal(){
		System.out.print("Informe o valor de A: ");
		a = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor de B: ");
		b = Integer.parseInt(System.console().readLine());
		System.out.print("Informe o valor de C: ");
		c = Integer.parseInt(System.console().readLine());
		System.out.println(a+"x^2 + "+b+"x + "+c);
		d = delta(a,b,c);
		if(d >= 0){
			xisM = xisMais(d,a,b,c);
			xisMe = xisMenos(d,a,b,c);
			System.out.println("x1 = "+xisM);
			System.out.println("x2 = "+xisMe);
		}else{
			System.out.println("Delta não possui raiz!");
		}
	}
	private static double delta(int a, int b , int c){
		double delta;
		delta = (double) (Math.pow(b,2) - (4*(a*c)));
		return delta;
	}
	private static double xisMais(double delta, int a, int b, int c){
		double xis;
		xis = ((-(b) + Math.sqrt(delta)) / 2*a);
		return xis;
	}
	private static double xisMenos(double delta, int a, int b, int c){
		double xis;
		xis = ((-(b) - Math.sqrt(delta)) / 2*a);
		return xis;	
	}
	public static void main(String[] args) {
		new Baskara();
	}
}