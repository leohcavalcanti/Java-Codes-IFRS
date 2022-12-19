import java.util.Random;

public class Terceiro {

    public Terceiro() {
        matriz();
    }
    public void matriz(){
        int[][] tab = new int[5][5];
        int[] resul = new int[5];
        int menor = 4, maior = 0, add = 0, soma = 0;
        Random gerador = new Random();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                tab[i][j] = gerador.nextInt(100);
                if (i == maior && j == menor){
                    resul[add++] = tab[i][j];
                    maior++; menor--;
                }
            }
        }

        for (int numeros: resul){
            soma = numeros + soma;
        }

        System.out.println("Soma final: "+soma);
    }
}
