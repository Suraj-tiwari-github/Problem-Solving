package ProblemSolving.StringProblems;

public class BinaryToDecimal {
    public static String findInt(String str){
        int result=0;
        for(int i=str.length()-1; i>=0; i++){
            result+=Math.pow(2,i);
        }
        return "";
    }
    public static void main(String[] args) {
        String str="1010";
        System.out.println(findInt(str));
    }
}
