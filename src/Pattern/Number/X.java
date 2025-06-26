package Pattern.Number;

public class X {
    public static void main(String[] args) {
        int n = 5;
        X_I(n);
        System.out.println();
        X_J(n);
    }

    public static void X_I(int n){

        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
                if((i == j) || (j == (n - i + 1))){
                    System.out.print(i + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void X_J(int n){

        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
                if((i == j) || (j == (n - i + 1))){
                    System.out.print(j + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
