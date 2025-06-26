package Pattern.Number;

public class InvertNumber {
    public static void main(String[] args) {
        int n = 8;
       Invert(n);
       InvertPattern(n);
    }

    public static void Invert(int n){
        int value = 0 , difference = 0;

        for(int i = 1; i <= n; i++){
            value = i;
            difference = n;
            for(int j = 1; j <= (n - i + 1); j++){
                System.out.print(value + " ");
                value += difference;
                difference -= 1;
            }
            System.out.println();
        }
    }

    public static void InvertPattern(int n){
        int value = 0 , difference = 0;

        for(int i = 1; i <= n; i++){
            value = i;
            difference = n - 1;
            for(int j = 1; j <= i; j++){
                System.out.print(value + " ");
                value += difference;
                difference -= 1;
            }
            System.out.println();
        }
    }
}
