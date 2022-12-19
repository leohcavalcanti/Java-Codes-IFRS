import java.util.Scanner;

public class Quinto {

    public Quinto() {

    }
    public void main(){
        int[][] prova = new int[15][5];
        String[] nome = new String[15];
        int cont = 0, soma = 0;
        float media;

        Scanner in = new Scanner(System.in);

        for (int l = 0; l < 15; l++){
            System.out.println("Cadastro do "+l+" Aluno");
            nome[l] = in.nextLine();
            for (int c = 0; c < 5; c++){
                System.out.println("Cadastre a "+c+" notas: ");
                prova[l][c] = in.nextInt();
            }
        }

        do {
            for (int c = 0; c < 5; c++){
                soma = prova[cont][5] + soma;
            }
            media = soma / 5;
            System.out.println("Aluno "+nome[cont]+ " e sua média: "+media);
            if (media >= 1){
                System.out.println("Aprovado!");
            }else{
                System.out.println("Reprovado!");
            }
        }while (cont == 15);
    }
}
