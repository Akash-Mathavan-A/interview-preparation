package Pattern.Medium;

public class XOPattern {
    public static void main(String[] args){
        int n = 4;

        patternNxN(n);
        System.out.println();
        patternMxM(n);
        System.out.println();
    }

    public static void patternNxN(int n){

        double center = n;
        System.out.println(center);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int value = (int) (Math.max(Math.abs(i - center) , Math.abs(j - center)) + 1);
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

    public static void patternMxM(int n){

        int center = n - 1;

        int m = n * 2 - 1;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                int value = Math.max(Math.abs(i - center) , Math.abs(j - center)) + 1;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
