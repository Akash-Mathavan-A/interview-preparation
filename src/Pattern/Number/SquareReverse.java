package Pattern.Number;

public class SquareReverse {
    public static void main(String[] args) {
        int n = 5;

        for(int i = n; i >= 1; i--){
                int value = (i * n) - n;
            for(int j = 1; j <= (n * 2 - 1); j++){
                if(j % 2 == 1){
                    value += 1;
                    System.out.print(value + " ");
                }else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
