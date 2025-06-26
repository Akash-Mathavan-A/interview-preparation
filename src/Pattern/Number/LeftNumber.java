package Pattern.Number;

public class LeftNumber {
    public static void main(String[] args) {
        int n = 5;
        int increase = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                increase += 1;
                System.out.print(increase + " ");
            }
            System.out.println();
        }

    }
}
