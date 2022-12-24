import java.util.Random;

public class Segundo {

    public Segundo() {
        matriz();
    }

    public void matriz() {
        Random gerador = new Random();
        int[][] tab = new int[10][10];
        int[] resul = new int[10];
        int add = 0, soma = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tab[i][j] = gerador.nextInt(100);
                if (i == j){
                    resul[add] = tab[i][j];
                    add++;
                }
            }
        }

        for (int numeros: resul){
            soma = numeros + soma;
        }
        add = soma / 5;

        System.out.println("Média: "+add);
    }
}
