package Pattern.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };
        System.out.println(Arrays.deepToString(arr));
        List<Integer> result = spiral(arr);
        System.out.println(result);
    }

    public static List<Integer> spiral(int[][] arr){

        List<Integer> result = new ArrayList<>();

        int top = 0 , bottom = arr.length - 1 , left = 0 , right = arr[0].length - 1;

        while((top <= bottom) && (left <= right)){

            for(int i = left; i <= right; i++){
                result.add(arr[top][i]);
            }
            top += 1;

            for(int i = top; i <= bottom; i++){
                result.add(arr[i][right]);
            }
            right -= 1;

            if(!((top <= bottom) && (left <= right))){
                break;
            }

            for(int i = right; i >= left; i--){
                result.add(arr[bottom][i]);
            }
            bottom -= 1;

            for(int i = bottom; i >= top; i--){
                result.add(arr[i][left]);
            }
            left += 1;
        }

        return result;
    }
}
