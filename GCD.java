package ProblemSolving;

// GCD is a greatest common divisior.

public class GCD {
    public static void findGcd(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
                if(a==0){
                    System.exit(1);
                }
            }
            else{
                b=b-a;
                if(b==0) System.exit(1);
            }
            if(a==b){
                System.out.println("GCD : "+a);
            }
        }
    }
    public static void main(String[] args) {
        int a=10, b=15;
        findGcd(a,b);
        int result=1;

        // GCD Greatest Common Divisor.
        // step: 1 Find the smaller number and that will be its  nth for us to iterate.
        // step: 2, If any number either from the first iteration from i=2 (result will be found at later stage of
            // iteration). If we iterate from min element(smallest in a or b) to 2. (the number which is divisible by both
        // step 3: the result will would be GCD>
        int x;
        if(a>b){
            x=b;
        }
        else{
            x=a;
        }

        for(int i=2; i<=x; i++){
            if(a%i==0 && b%i==0){
                result=i;
            }
        }

        System.out.println(result);

    }
}
