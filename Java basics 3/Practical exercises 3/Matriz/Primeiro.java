import java.util.Random;
import java.util.Scanner;

public class Primeiro {

    public Primeiro() {
        addMatriz();
    }

    public void addMatriz(){
        Random gerador = new Random();
        int[][] tab = new int[6][4];
        int[][] resul = new int[6][4];
        int value, maiorValor = 0;

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++){
                value = gerador.nextInt(100);
                if (maiorValor < value){
                    maiorValor = value;
                }
                tab[i][j] = value;
            }
        }

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++){
                resul[i][j] = tab[i][j] * maiorValor;
                System.out.println("Resultado da Matriz ["+i+"]["+j+"]: " +resul[i][j]);
            }
        }
    }
}
