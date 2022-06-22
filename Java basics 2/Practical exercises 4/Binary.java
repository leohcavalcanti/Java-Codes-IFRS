public class Binary{
	public static void main(String[] args) {
		int maximum = 100;
		for(int i=0;i<=100;i++){
			String num = Integer.toString(i);
			System.out.println("valor "+i+" em byte "+Byte.parseByte(num, 2));
		}
	}
}