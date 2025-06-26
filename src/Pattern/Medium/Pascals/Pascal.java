package Pattern.Medium.Pascals;

import java.util.ArrayList;

public class Pascal {
    public static void main(String[] args) {
        int n = 8;
        ArrayList<Integer> pascalResult = pascal_N(n);
        System.out.println(pascalResult);
    }

    public static ArrayList<Integer> pascal_N(int n){

        if(n == 0){
            return new ArrayList<>();
        }

        int result = 1;

        ArrayList<Integer> resultList = new ArrayList<>();

        resultList.add(result);

        if(n == 1){
            return resultList;
        }

        for(int i = 0; i < n - 1; i++){
            result = (result * (n - i - 1)) / (i + 1);
            resultList.add(result);
        }
        return resultList;
    }
}
