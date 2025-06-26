package Pattern.Number;

public class LeftIncreaseDecrease {
    public static void main(String[] args) {
        int n = 7;
        int count = 0 , value = 0;

        for(int i = 1; i <= n; i++){
            count += i;
            value = (i % 2 == 1) ? count - i + 1 : count;
            for(int j = 1; j <= i; j++){
                System.out.print(value + " ");
                value = (i % 2 == 1) ? value + 1 : value - 1;
            }
            System.out.println();
        }
    }
}
