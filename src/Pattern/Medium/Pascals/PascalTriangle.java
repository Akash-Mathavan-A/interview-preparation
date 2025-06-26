package Pattern.Medium.Pascals;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 8;
        ArrayList<ArrayList<Integer>> pascalList = Pascal(n);

        System.out.println(pascalList);
    }

    public static ArrayList<ArrayList<Integer>> Pascal(int n){

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            result.add(new ArrayList<>(pascals(i)));
        }

        return result;
    }

    public static ArrayList<Integer> pascals(int n){

        int result = 1;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(result);

        if(n == 0){
            return list;
        }

        for(int i = 0; i < n; i++){
            result = (result * (n - i)) / (i + 1);
            list.add(result);
        }
        return list;
    }
}
