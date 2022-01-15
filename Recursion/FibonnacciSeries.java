package ProblemSolving.Recursion;

public class FibonnacciSeries {
    public static int findFibonnacci(int n){
        //* Time complexity is T(n-2)+T(n-1): 2(T(n-1): This can be taken in the upper boudn as 2^n. exponential
        if(n<=1){
            return n;
        }
        else{
            return findFibonnacci(n-2)+findFibonnacci(n-1);
        }
    }

    public static int FibonnacciIterative(int n){
        //* Time complexity is O(n)
        int a=0;
        int b=1;
        int c=0;
        for(int i=2; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    static int lookup[]=new int[20];
    public static int FibLookUpTable(int n){
        if(n<=1){
            lookup[n]=n;
            return n;
        }

        if(lookup[n-2]==0){
            lookup[n-2]=FibLookUpTable(n-2);
        }
        if(lookup[n-1]==0){
            lookup[n-1]=FibLookUpTable(n-1);
        }

        return lookup[n-2]+lookup[n-1];
    }
    public static void main(String[] args) {

        System.out.println(findFibonnacci(8));
        System.out.println(FibonnacciIterative(8));
        System.out.println(FibLookUpTable(8));
    }
}
