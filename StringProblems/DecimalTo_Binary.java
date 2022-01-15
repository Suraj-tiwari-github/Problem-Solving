package ProblemSolving.StringProblems;

import java.util.Scanner;

public class DecimalTo_Binary {
    public static void findBinary(int input){
        String s="";
        while(input>0){
            s=(input%2)+s;
            input=input/2;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int input;
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        findBinary(input);

    }
}
