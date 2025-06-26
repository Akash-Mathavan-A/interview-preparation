package Pattern.Number.InvertTriangle;

public class InvertCloseOdd {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            int value = i - 1;
            for(int j = 1; j < (n + i); j++){
                if(j <= n - i){
                    System.out.print("  ");
                }else if(j <= n){
                    value += 1;
                    System.out.print(value + " ");
                }else{
                    value -= 1;
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
}
