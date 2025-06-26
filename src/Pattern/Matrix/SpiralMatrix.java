package Pattern.Matrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 4;
        int[][] result = pattern(n);

        for(int[] arr : result){
            for(int value : arr){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pattern(int n){

        int[][] result = new int[n][n];

        int top = 0 , bottom = n - 1 , left = 0 , right = n - 1 , value = 0;

        while((top <= bottom) && (left <= right)){

            for(int i = left; i <= right; i++){
                result[top][i] = ++value;
            }
            top += 1;

            for(int i = top; i <= bottom; i++){
                result[i][right] = ++value;
            }
            right -= 1;

            for(int i = right; i >= left; i--){
                result[bottom][i] = ++value;
            }
            bottom -= 1;

            for(int i = bottom; i >= top; i--){
                result[i][left] = ++value;
            }
            left += 1;
        }

        return result;
    }
}
