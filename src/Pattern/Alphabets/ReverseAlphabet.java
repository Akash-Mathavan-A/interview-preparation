package Pattern.Alphabets;

public class ReverseAlphabet {
    public static void main(String[] args) {
        int n = 5;
        alphabets(n);
    }

    public static void alphabets(int n){

        for(int i = 1; i <= n; i++){
            int value = (i % 2 == 1) ? (i * n) - n : (i * n) + 1;
            for(int j = 1; j <= n; j++){
                if(i % 2 == 1){
                    value += 1;
                    System.out.print((char)(value + 64) + " ");
                }else{
                    value -= 1;
                    System.out.print((char) (value + 64) + " ");
                }
            }
            System.out.println();
        }
    }
}
