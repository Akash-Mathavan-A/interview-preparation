package Pattern.Number;

public class StarMix {
    public static void main(String[] args) {
        int n = 5;
        int m = (n * 2) - 1;
        int value = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(j % 2 == 1){
                    value += 1;
                    System.out.print(value + " ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
