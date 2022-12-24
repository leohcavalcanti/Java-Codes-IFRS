import java.util.Scanner;

public class Quarto {

    public Quarto() {
        pergusta();
    }

    public void pergusta(){
        int[][] prova = new int[10][10];
        int[] res;
        int[] pontosAlunos = new int[10];
        Scanner in = new Scanner(System.in);
        char resp, pontos = 0;
        int cont = 0;

        System.out.println("Cadastra as respostas");
        res = resposta();

        for (int i = 0; i < 10;i++){
            System.out.println("cadastra a resposta do "+(i+1)+" candidato");
            for (int j = 0; j < 10; j++){
                System.out.print((j+1)+" questão: ");
                resp = in.next().charAt(0);
                while (resp > 'E' || resp > 'e'){
                    System.out.println("Resposta vão até a letra 'E'");
                    System.out.print((j+1)+" questão: ");
                    resp = in.next().charAt(0);
                }
                prova[i][j] = resp;
            }
        }

        do {
            for (int i = 0; i < 10; i++){
                if (res[i] == prova[cont][i]){
                    pontos++;
                }
            }
            pontosAlunos[cont] = pontos;
        }while (cont == 10);

        System.out.println("Notal Final:");
        for (int respostas: pontosAlunos){
            System.out.println(respostas);
        }

    }

    public int[] resposta(){
        Scanner in = new Scanner(System.in);
        int[] resp = new int[10];
        for (int r = 0; r < 10; r++){
            System.out.println("Coloque as resposta 1 a 10: Resposta do "+r+": ");
            resp[r] = in.next().charAt(0);
        }
        return resp;
    }
}
