package ProblemSolving;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";

        int i=s1.length()-1;
        while(i>=0){
            s2=s2+s1.charAt(i);
            i--;
        }
        System.out.println(s2);

    }
}
