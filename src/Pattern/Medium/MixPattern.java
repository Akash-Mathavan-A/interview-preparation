package Pattern.Medium;

public class MixPattern {
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }

    public static void pattern(int n){

        int columnValue = 1;

        for(int i = 1; i <= n; i++){
            int value = columnValue;
            int difference = i + 1;
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(value + " ");
                value += difference;
                difference += 1;
            }
            columnValue += i;
            System.out.println();
        }
    }
}


