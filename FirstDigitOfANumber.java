package ProblemSolving;

import java.util.Scanner;

public class FirstDigitOfANumber {
    public static void getFirstDigit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int digit=sc.nextInt();
        while(digit>10){
            digit/=10;
        }
        System.out.println("The first Digit of a number is :"+digit);

    }


    /* A different and more efficient approach to find teh first digit of an number.
    * If we perform log base 10 ( given input) -> it will return the length of a number-1 which means.
    * if 9678 is given then log 10(9678) will return 3.
    * by taking that number, if we perform Math.pow(10,3), will get 1000.
    * now divide the given number with 10^3.
    * */


    public static int FirstDigitGFG(int n){
        double power=Math.log10(n);
        int p=(int)Math.pow(10,(int)power);
        int result=n/p;
        return result;


    }
    public static void main(String[] args) {

        getFirstDigit();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int digit=sc.nextInt();
        System.out.println(FirstDigitGFG(digit));

    }
}
