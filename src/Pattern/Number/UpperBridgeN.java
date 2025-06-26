package Pattern.Number;

public class UpperBridgeN {

    public static void main(String[] args) {
        int n = 5;
        Pattern1(n);
        System.out.println();
        patternN(n);
    }

    public static void Pattern1(int n){
        int m = (n * 2 - 1);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(j <= n){
                    if(j <= n - i + 1){
                        System.out.print(j + " ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(j >= (m - n + i)){
                        System.out.print((m - j + 1) + " ");

                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void patternN(int n){
        int m = (n * 2 - 1);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(j <= n){
                    if(j <= n - i + 1){
                        System.out.print((n - j + 1) + " ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(j >= (m - n + i)){
                        System.out.print((j - n + 1) + " ");

                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
