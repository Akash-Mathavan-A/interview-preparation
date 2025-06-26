package Pattern.Medium;

public class Concentric {
    public static void main(String[] args) {
        int n = 5;
        concentricNM(n);
        System.out.println();
        concentricN(n);
        System.out.println();
        lowConcentric(n);
    }

    public static void concentricNM(int n){

        int m = (n * 2) - 1;

        int centerValue = n - 1;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                int max = Math.max(Math.abs(i - centerValue) , Math.abs(j - centerValue)) + 1;
                System.out.print(max + " ");
            }
            System.out.println();
        }
    }

    public static void concentricN(int n){

        int centerValue = n / 2;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int max = Math.max(Math.abs(i - centerValue) , Math.abs(j - centerValue)) + 1;
                System.out.print(max + " ");
            }
            System.out.println();
        }
    }


    public static void lowConcentric(int n){
        int m = (n * 2) - 1;

        int centerValue = n - 1;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                int max = centerValue - Math.max(Math.abs(i - centerValue) , Math.abs(j - centerValue)) + 1;
                System.out.print(max + " ");
            }
            System.out.println();
        }
    }

}
