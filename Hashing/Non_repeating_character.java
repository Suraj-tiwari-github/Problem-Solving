package ProblemSolving.Hashing;

import java.util.HashMap;

public class Non_repeating_character {
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        for(int i=0;i<S.length();i++){
            if(h.containsKey(S.charAt(i))==false){
                h.put(S.charAt(i),1);
            }
            else{
                h.put(S.charAt(i),h.get(S.charAt(i))+1);
            }
        }
        for(int i=0;i<S.length();i++){
            if(h.get(S.charAt(i))==1){
                return S.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s="zxvczbtxyzvy";
        System.out.println(nonrepeatingCharacter(s));
    }
}
