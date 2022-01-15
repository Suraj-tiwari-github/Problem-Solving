package ProblemSolving.Searching;

public class FindSquareRoot {
    public static int getSquareRoot(int x){
        int t1=0,t2=0;
        int i=1;
        while(x>0){
            t2=i*i;
            if(t2==x){
                t1=i;
                return t1;
            }
            if(t2>x){
                return t1;
            }
            t1=i;
            i++;

        }
        return -1;

    }

    public static int gfgGetSquareRoot(int x){
        //* The time complexity of this approach is theta of root (x).
        int i=1;
        while(i*i<=x){
            i++;
        }
        return i-1;
    }

    public static int gfgEfficientSolution(int x){
        //* This solution takes Logx
        int low=1, high=x, ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int square=mid*mid;
            if(square==x){
                return mid;
            }
            else if(square>x){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getSquareRoot(10));
        System.out.println(gfgGetSquareRoot(10));
        System.out.println(gfgEfficientSolution(10));
    }
}
