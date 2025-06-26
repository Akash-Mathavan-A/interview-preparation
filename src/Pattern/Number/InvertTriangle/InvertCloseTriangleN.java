package Pattern.Number.InvertTriangle;

public class InvertCloseTriangleN {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            int m = (n * 2) - i;
            int value = i - 1;
            for(int j = 1; j <= m; j++){
                if(i > j){
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
