package Pattern.Medium;

public class InvertCloseTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            int m = (n * 2) - i;
            for(int j = 1; j <= m; j++){
                if(i > j){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
