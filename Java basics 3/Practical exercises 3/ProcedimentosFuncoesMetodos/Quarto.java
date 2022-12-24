import java.util.Random;

public class Quarto {
    public Quarto() {
        main();
    }
    public void main(){
        Random gerar = new Random();
        int[] A = new int[25];

        for (int i = 0; i < 25; i++){
            A[i] = gerar.nextInt();
        }
        A = verificar(A);

        for (int i = 0; i < 25; i++){
            System.out.println("Vetor: "+A[i]);
        }
    }

    public int[] verificar(int[] vetor){
        for (int i = 0; i < 25; i++){
            if(vetor[i] < 0){
                vetor[i] = 0;
            }
        }
        return vetor;
    }
}
