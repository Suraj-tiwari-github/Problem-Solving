package ProblemSolving.Recursion;

public class All_In_OneRecursion {
    static double power=1;
    static double fact=1;
    public static double TaylorSeries(int x, int n){

        /*
        * The Formula for Taylor series is :
        * e^x= 1+x/1 + x^2/2!  + x^3/3! + x^4/4! +.... + n terms */


        double  result=1;
        if(n==0){
            return 1;
        }
        else{
            result=TaylorSeries(x,n-1);
            power*=x;
            fact*=n;
            return result+power/fact;

        }

    }

    static double result1=1;
    public static double TaylorSeriesWithOrderOfN(int x, int n){
         if(n==0){
             return result1;

         }

         result1=1+x*result1/n;
        return  TaylorSeriesWithOrderOfN(x,n-1);


    }

    public static double TaylorSeriesWithIterative(int x, int n){
        double result2=1;
        double power=1;
        double factorial=1;
        for(int i=1; i<=n; i++){
            power*=x;
            factorial*=i;
            result2+=power/factorial;
        }
        return result2;
    }
    public static void main(String[] args) {
        int normal=10;
          int n=10;
          int x=2;

        System.out.println(TaylorSeries(x,n));
        System.out.println(TaylorSeriesWithOrderOfN(x,n));
        System.out.println(TaylorSeriesWithIterative(x,n));


    }
}
