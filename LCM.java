package ProblemSolving;

// Step 1: LCM (Least Common Division) the inital iteration would be the max number which is given
// step 2: And for nth for iteration will be a*b.
// step 3: if any first number from the max element divides both the number then it is our LCM>
public class LCM {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int i=Math.max(a,b);
        int result=1;
        while(i!=a*b){
            if(i%a==0 && i%b==0){
                result=i;
                break;
            }
            i++;
        }


        System.out.println(result);
    }
}
