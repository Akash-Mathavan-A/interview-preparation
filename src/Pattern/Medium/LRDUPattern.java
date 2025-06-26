package Pattern.Medium;

public class LRDUPattern {
    public static void main(String[] args) {
        int n = 10;
        pattern(n);
    }

    public static void pattern(int n){

        int m = n / 2 + 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j){
                    System.out.print("\\ ");
                }else if(j == n - i + 1){
                    System.out.print("/ ");
                }else {
                    if(i <= m){
                        if(i > j){
                            System.out.print("L ");
                        }else if(j <= n - i){
                            System.out.print("U ");
                        }else{
                            System.out.print("R ");
                        }
                    }else{
                        if(j <= n - i){
                            System.out.print("L ");
                        } else if(i > j){
                            System.out.print("D ");
                        }else{
                            System.out.print("R ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
