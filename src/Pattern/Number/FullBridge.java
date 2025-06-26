package Pattern.Number;

public class FullBridge {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n){
        int m = (n * 2 - 1);

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= m; j++){
                if(i <= n){
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
                }else{
                    if(j <= n){
                        if(j <= i - n + 1){
                            System.out.print((n - j + 1) + " ");
                        }else{
                            System.out.print("  ");
                        }
                    }else{
                        if(j >= (m + n - i)){
                            System.out.print((j - n + 1) + " ");

                        }else {
                            System.out.print("  ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
