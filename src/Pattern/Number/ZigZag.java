package Pattern.Number;

public class ZigZag {
    public static void main(String[] args) {
        int n = 5;
        zigzag(n);
    }

    public static void zigzag(int n){

        int m = (n * 2) - 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == j){
                    System.out.print(i + " ");
                } else if(j == (m - i + 1)){
                    System.out.print((n - i + 1) +  " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
