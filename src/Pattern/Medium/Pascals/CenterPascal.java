package Pattern.Medium.Pascals;

public class CenterPascal {
    public static void main(String[] args) {
        int n = 8;
        pascal(n);
    }

    public static void pascal(int n){

        if(n == 0){
            return;
        }

        for(int i = 0; i < n; i++){

            for(int space = 0; space <= n - i + 1; space++){
                System.out.print(" ");
            }

            int result = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(result + " ");
                result = (result * (i - j)) / (j + 1);
            }
            System.out.println();
        }
    }
}
