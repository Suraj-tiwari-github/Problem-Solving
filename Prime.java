import java.util.*;
import java.lang.*;

/*
* Prime: The numbers which are divisible by itself and the 1 is called as prime numbers.
* 2 is only the even prime number rest of the even numbers are not the prime numbers.
* 1 is not a prime number because 1 is not a composite number nor prime number.
* composite number: All the natural number (1 to +ve) can be divided into 2 categories which are prime and composite numbers.
* The numbers which have other divisible as well it is called as composite number, and 1 itself it the only no.
* which have no other divisible to it.  */
public class Prime {

    // static byte findPrime(int x){
    //     if(x<=2){
    //         return 1;
    //     }

    //     for(int i=2; i<x/2; i++){
    //         if(x%i==0)
    //             return 1;
            
    //     }
    //         return 0;
    //*

        
    // }

    public static boolean findPrime(int n){
        for(int i=2; i<n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean findPrimeGFG(int n){
/*  Idea: Divisors always appeared in pairs.
    30: (1,30), (2,15), (3,10), (5,6).
    so the idea is not to check from 2 to n-1, we need to check only for 2 to sqrt of n.
* */
        //* Time complexity of this approch : O(sqrt (n) ).

        if(n<2){
            return false;
        }

        for(int i=2; i*i<=n; i++){
            if(n%i==0)
                return false;
        }
        return true;

    }

    public static boolean NaiveMethod_isPrime(int n){
        //* Naive method: A method which is less tricky and looks straight forward
        //* the time complexity of this approach is O(n).
        //* given a number to find it's prime or not, we'll start from i=2, search till n-1.
        //* if any method divides then it is not a prime.

        if(n==1){
            return false;
        }

        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

    public static boolean MoreEfficient_isPrime(int n){
        //* This is the approach for the larger number to find a prime,
        //* even the sqrt of a large number is quiet large to compare, we are initially checking for the numbers
        //* like 2 and 3 if any number is not divisible by 2 then it won't be divisible by 4,6,8,10,12...
        //* same goes for 3 also-> 6,9,12,15,18,21,24.
        //* the initial iteration we'll start from i=5 and increment i+6, because if i =5 then adding 6, will result in
        //* 11, adding 6 will result in 17. so the prime series will be continued.
        if(n<2){
            return false;
        }
        if(n%2==0 || n%3==0) return false;


        for(int i=5; i*i<=n; i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;

        //* dry-run:
      /*
       for n=1031 which is a prime number.
       i=5 -> check for 5 and i+2 which is 7.
       i=11 -> check for 11 and i+2 which is 13.
       i=17-> check for 17 and i+2 which is 19.
       i=23-> check for 23 and i+2 which is 25.
       i=29-> check for 29 and i+2 which is 31.
       i=35 wait 35*35 =1225 which is greater than 1031, we break and return true.

       we have optimized the iteration from 2 to n-1 to only 6 iteration. It is the most efficient way to do so
       almost 3 times faster than efficient approach.

       */
    }
    public static void main(String args[]){
        
//
//        Integer houseProperty;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter two numbers to find out the GCD:");
//        // int i=sc.nextInt();
//        // byte result=findPrime(i);
//        // if(result==0)
//        //     System.out.println(i+" is prime number ");
//        // else
//        //     System.out.println(i +" is not a prime number ");
//
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        while(a!=b){
//        if(a>b){
//            a=a-b;
//            if(a==0){
//                System.exit(1);
//            }
//        }
//        else{
//            b=b-a;
//            if(b==0)
//                System.exit(1);
//        }
//        if(a==b){
//            System.out.println("The GCD of the number is : " +a);
//            System.exit(1);
//        }

        int n=20;
        System.out.println("Given number is prime: "+ findPrime(2));
        System.out.println("Given number is prime: "+ MoreEfficient_isPrime(2));

    }
}
