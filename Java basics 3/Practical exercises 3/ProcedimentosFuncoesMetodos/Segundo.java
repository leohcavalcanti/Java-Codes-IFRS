import java.util.Scanner;

public class Segundo {
    public Segundo() {
        main();
    }
    public void main(){
        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("Informe o valor de 'x': ");
        x = in.nextInt();

        System.out.printf("%.2f", soma(x));
    }

    public double soma(int x){
        double i, total = 1.0;
        for (i = 1; i <= 15; i++){
            total = total + (Math.pow(x, i) / fatorial((int) i));
        }
        return total;
    }

    private int fatorial(int num) {
        int menor = num - 1;
        if (num == 0 || num == 1){
            return 1;
        }
        do {
            num = num * menor;
            menor--;
        }while (menor > 1);
        return num;
    }
}
