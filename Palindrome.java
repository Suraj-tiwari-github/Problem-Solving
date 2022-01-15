package ProblemSolving;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";

        int length=s1.length()-1;

        while(length>=0){
            s2=s2+s1.charAt(length);
            length--;
        }

        if(s1.equals(s2)){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
