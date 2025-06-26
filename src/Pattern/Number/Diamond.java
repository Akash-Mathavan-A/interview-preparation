package Pattern.Number;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;
        diamond(n);
    }

    public static void diamond(int n){

        int m = (n * 2) - 1;

        for(int i = 1; i <= m; i++){
            int value = 0;
            for(int j = 1; j <= n; j++){
                if(i <= n){
                    if(j <= n - i){
                        System.out.print(" ");
                    }else{
                        value += 1;
                        System.out.print(value + " ");
                    }
                }else{
                    if(j <= i - n){
                        System.out.print(" ");
                    }else{
                        value += 1;
                        System.out.print(value + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
