package Pattern.Alphabets;

public class Bridge {
    public static void main(String[] args) {
        int n = 8;
        int m = (n * 2 - 1);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(j <= n){
                    if(j <= n - i + 1){
                        System.out.print((char)(j + 64) + " ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(j >= (m - n + i)){
                        System.out.print((char) (m - j + 65) + " ");

                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
