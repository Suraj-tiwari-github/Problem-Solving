package ProblemSolving.Searching;

public class Count_1s_sorted_binary_array {
    public static int CountNos_1(int arr[]){
        if(arr[0]==1 && arr[arr.length-1]==1){
            return arr.length;
        }
        if(arr[0]==0 && arr[arr.length-1]==0){
            return 0;
        }

        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==0){
                low=mid+1;
            }
            else if(mid==0 || arr[mid-1]==0){
                return arr.length-mid;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,1,1,1,1};
        System.out.println(CountNos_1(arr));
    }
}
