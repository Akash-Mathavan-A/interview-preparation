package Pattern.Medium;

public class HalfDiamond {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
        System.out.println();
        patternLoop(n);
    }


    public static void pattern(int n){
        int m = (n * 2) - 1;

        for(int i = 1; i <= m; i++){
            if(i <= n){
                for(int j = 1; j <= i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j = 1; j <= (m + 1 - i); j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void patternLoop(int n){
        int m = (n * 2) - 1;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(i <= n){
                    if(j <= i){
                        System.out.print("* ");
                    }
                }else{
                    if(j <= (m + 1 - i)) {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
