package Pattern.Number;

public class LeftDecrease {
    public static void main(String[] args) {
        int n = 8;

        for(int i = 1; i <= n; i++){
            int value = n - i;
            for(int j = 1; j <= (n - i + 1); j++){
                System.out.print(value + " ");
                value -= 1;
            }
            System.out.println();
        }
    }
}
