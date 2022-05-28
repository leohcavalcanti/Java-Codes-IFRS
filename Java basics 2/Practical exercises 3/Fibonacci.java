public class Fibonacci{
	public static void main(String[] args) {
		int sum, start = 1, tail = 1, count = 0;

		do{
			System.out.println(start+" , "+tail);
			sum = start + tail;
			count++;
			start = sum;
			tail = start + tail;
		}while(count != 10);
		
	}
}