package ProblemSolving.Recursion;

import java.util.Arrays;

public class PalindromeRecursion {
    static String result="No";
    public static String checkPanlindrome(String str, int low, int high){

        if(low>high){
            result="Yes";
            return result;
        }

        if(str.charAt(low)==str.charAt(high)){
            low++;
            high--;
            checkPanlindrome(str, low, high);
        }
        else{
            result="No";
            return result;
        }

        return result;

    }
    public static void main(String[] args) {
        String str="cabac";
//        System.out.println(checkPanlindrome(str, 0, str.length()-1));
        System.out.println("\"Suraj Tiwari\"");
        int a=10;
        int b=20;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
