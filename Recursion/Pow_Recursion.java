package ProblemSolving.Recursion;

import java.util.Scanner;

public class Pow_Recursion {
    public static int findPow(int m, int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return findPow(m*m, n/2);
        }
        else{
            return m*findPow(m*m, n/2);
        }
    }
    public static void main(String[] args) {
        int input;
        System.out.println("Enter the base");
        Scanner sc=new Scanner(System.in);
        input=sc.nextInt();
        System.out.println("Enter the power");
        int power=sc.nextInt();

        System.out.println(findPow(input,power));
    }
}
