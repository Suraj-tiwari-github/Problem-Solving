package ProblemSolving.Recursion;

public class printSequenceString {
    public static void printSubsequence(String str, String currentCharacter, int index){
        if(index==str.length()){
            System.out.println(currentCharacter+"  ");
            return;
        }

        printSubsequence(str,currentCharacter,index+1);
        printSubsequence(str,currentCharacter+str.charAt(index),index+1);
    }
    public static void main(String[] args) {
        String s="ABC";

        printSubsequence(s,"", 0);
    }
}
