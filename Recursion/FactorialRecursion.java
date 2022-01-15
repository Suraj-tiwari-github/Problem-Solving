package ProblemSolving.Recursion;

import java.util.Scanner;

public class FactorialRecursion {
    public static int findFact(int input){
        if(input==0){
            return 1;
        }
        else{
            return input*findFact(input-1);
        }
    }

    public static void findNCRFormula(int n, int r){
        //* The formula for ncr is : n!/ r!(n-r)!

        int nth=findFact(n);
        int rth=findFact(r);
        int n_rth=findFact(n-r);

        System.out.println(nth / rth *(n_rth));
    }

    public static int pascalNCRFormual(int n, int r){
        if(n==0 || n==r){
            return 1;
        }
        else{
            return pascalNCRFormual(n-1,r-1)+pascalNCRFormual(n-1,r);
        }
    }
    public static void main(String[] args) {
        int input;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        System.out.println(findFact(input));

        findNCRFormula(5,3); // 5C3
        System.out.println(pascalNCRFormual(5,3));
    }
}
