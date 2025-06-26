package Pattern.Medium;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;

        int m = n * 2 - 1;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(i <= n){
                    if(j <= n - i){
                        System.out.print(" ");
                    }else {
                        System.out.print("* ");
                    }
                }else{
                    if(j <= i - n){
                        System.out.print(" ");
                    }else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
