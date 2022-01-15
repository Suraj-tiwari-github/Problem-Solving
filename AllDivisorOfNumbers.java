package ProblemSolving;

public class AllDivisorOfNumbers {

    public static void printDivisiors(int n){
        for(int i=1; i*i<=n; i++){
            //* here i*i is working like a floor square root of a nth number.
            //* suppose 15 is given, 3*3=9, 4*4=16. so when the i=1, the condition will be checked for
            //* 1*1, when i=2 and condition check will be 4(2*2)<=15, when i=3 (3*3=9<=15), when i=4.
            //* 4*4=16<=15 (the condition will be failed for the i=4 iteration.
            if(n%i==0){
                System.out.println(i);
                //* i!=n/i will restrict the re printing of values, for example of let n=25, for the 5th iteration i=5
                //* so it will get evaluated as 5!=25/5 which became false and this loop will not get executed.
                if(i!=n/i)
                    System.out.println(n/i);
            }
        }
        //* the time complexity of this approach is i*i<=n which will be i^2<=n
        //* therefore i<=sqrt(n).

        //* there is a problem in the order of printing, if we want the printing in the sorted order then
    }

    public static void sortedPrintDivisiors(int n){
        int i=1;
        for(i=1; i*i<=n ; i++){
            //* here we are printing divisors from 1 (inclusive) to root(n), which is (exclusive)
            if(n%i==0){
                System.out.println(i);
            }
        }

        for( ; i>=1; i--){
            //* print all divisors from root(n) (inclusive) to n (inclusive)
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
        int n=20;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        System.out.println("\n Now with Print divisors.");
        // now let's try the efficient method.
        printDivisiors(n);
        System.out.println("\n\n");
        sortedPrintDivisiors(n);
    }
}
