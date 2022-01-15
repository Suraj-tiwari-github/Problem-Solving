package ProblemSolving.Recursion;

public class TowerOfHonoi {
    public static void TOH(int n, int A, int B, int C){
        if(n>0){
            TOH(n-1,A,C,B);
            System.out.println("From "+A+ " To "+ C+" ");
            TOH(n-1,B,A,C);
        }
    }
    public static void foo(int n, int sum){
        int k=0,j=0;
        if(n==0){
            return;
        }
        k=n%10;
        j=n/10;
        sum+=k;
        foo(j,sum);
        System.out.print(k);
    }
    public static void main(String[] args) {
        int a=2048, sum=0;
        foo(a, sum);
        System.out.println("\n"+ sum);

    }
}
