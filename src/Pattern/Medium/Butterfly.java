package Pattern.Medium;

public class Butterfly {
    public static void main(String[] args) {
        int n = 5 ;
        butterfly(n);
    }

    public static void butterfly(int n){

        int m = (n * 2);

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n + 1; j++){

                if(i <= n){
                    if(i >= j || j == n + 1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(j <= m - i + 1 || j == n + 1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}

