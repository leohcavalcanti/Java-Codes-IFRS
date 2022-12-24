public class Primeiro {
    public Primeiro() {
        main();
    }

    public void main(){
        int resul, subIni = 100, subProx = subIni - 1, infIni = 0, infProx = infIni + 1, soma1, soma2, total = 0;

        while (subProx >= 80) {
            soma1 = subIni / (fatorial(infIni));
            soma2 = subProx / (fatorial(infProx));
            total = total + (soma1+soma2);
            subIni = subProx - 1;
            subProx = subIni - 1;
            infIni = infProx + 1;
            infProx = infIni + 1;
        }

        System.out.println(total);
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
