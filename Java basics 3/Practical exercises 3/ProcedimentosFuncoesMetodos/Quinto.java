public class Quinto {
    public Quinto() {
        main();
    }
    public void main(){
        
    }
    private int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }
}
