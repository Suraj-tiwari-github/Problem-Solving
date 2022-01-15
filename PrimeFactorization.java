package ProblemSolving;
import java.sql.SQLOutput;
import java.util.Scanner;
public class PrimeFactorization {
    public static void primeFactor(int input){

        int i,x;
        for(int k=2; k<input; k++){
            if(isPrime(k)){
                //* we are taking every prime number and checking that prime  number can divide the given input,
                //* for example, given input given is 100-> 100 can be divided with prime 2,
                //* 100/2=50, Yes, It divides print 2. now again checking by multiplying the factor of the same prime
                //* number that is 2*2=4,
                //* 100/4=25, Yes it get divided then again we'll print 2
                //* when we check for the other prime numbers like 3,4 they will not get divide 100.
                //* so the next prime number will be 5, 5 can divide 100. Print 5.
                //* again multiply the number 5*5 to check again that it can divide or not.
                //* 100/25==0 , Yes print 5, again. that our answer.
                i=k;
                x=i;
                while(input%x==0){
                    System.out.print(i +" ");
                    x=x*i;
                }

            }
        }

    }
//    public static int[] getPrime(int input){
//        int arr[]=new int[input];
//        int k=0;
//
//        for(int i=2; i<=input; i++){
//            int primeResult=isPrime(i);
//            if(primeResult>0){
//                arr[k++]=primeResult;
//            }
//        }
//        return (arr);
//    }

    public static boolean isPrime(int i){
        if(i==2|| i==3){
            return true;
        }
        if(i%2==0 || i%3==0){
            return false;
        }
        if(i>4){
            for(int j=5; j<i; j++){
                if(i%j==0){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) throws Exception {
        /* Prime Factorization is the factors of a given number by using a prime factors .
        for example input:  20
        output: 2*2*5.

        input: 13
        output: 13

        Input: 50
        Output: 2*5*5.
* */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input=sc.nextInt();
        primeFactor(input);
    }
}
