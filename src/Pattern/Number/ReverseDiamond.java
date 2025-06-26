package Pattern.Number;

public class ReverseDiamond {
    public static void main(String[] args) {
        int n = 9;
        diamond(n);
    }

    public static void diamond(int n ){

        int m = (n * 2) - 1;

        for(int i = 1; i <= m; i++){
            int value = (i <= n) ? i - 1 : (m - i);

            for(int j = 1; j <= m; j++){
                if(i <= n){
                    if(j <= n && i <= j){
                        value += 1;
                        System.out.print(value + " ");
                    }else if(j > n && j <= (m + 1 - i)){
                        value -= 1;
                        System.out.print(value + " ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(j <= n && j >= (m - i + 1)){
                        value += 1;
                        System.out.print(value + " ");
                    }else if(j > n && i >= j) {
                        value -= 1;
                        System.out.print(value + " ");
                    } else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
