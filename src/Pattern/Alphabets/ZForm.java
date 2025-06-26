package Pattern.Alphabets;

import java.util.Scanner;

public class ZForm {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        int n = in.nextInt();

        String[] words = new String[n];

        for(int i = 0; i < n; i++){
            words[i] = in.next();
        }

        for(String word : words){

            if(checkLength(word)){
                pattern(word);
            }else{
                System.out.println("NO");
            }
        }
    }

    public static void pattern(String str){

        int n = (str.length() + 2) / 3;

        int k = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == n - i + 1){
                    System.out.print(str.charAt(k++) + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static boolean checkLength(String str){

        int n = str.length();

        if((n + 2) % 3 != 0){
            return false;
        }

        int length = (n + 2) / 3;

        if((3 * length) - 2 != n || length < 2){
            return false;
        }
        return true;
    }
}
