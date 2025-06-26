package Pattern.Alphabets;

public class X {
    public static void main(String[] args) {

        String str = "corporation";
        pattern(str);
        System.out.println();
        patterns(str);
    }

    public static void pattern(String str){

        int n = str.length();

        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
                if((i == j) || (j == (n - i + 1))){
                    System.out.print(str.charAt(i - 1) + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void patterns(String str){

        int n = str.length();

        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
                if((i == j) || (j == (n - i + 1))){
                    System.out.print(str.charAt(j - 1) + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
