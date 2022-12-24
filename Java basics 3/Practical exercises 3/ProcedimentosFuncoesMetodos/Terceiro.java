import java.util.Random;

public class Terceiro {
    public Terceiro() {
        main();
    }

    public void main(){
        for (int i = 2; i <= 100; i++) {
            if( ehPrimo(i) )
                System.out.println(i + " é primo.");
        }
    }

    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}
