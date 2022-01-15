package ProblemSolving.ArraysProblems;

public class NegOnTheLeftSideArray {
    public static void MoveNegOnTheLeft(int arr[]){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            while(arr[low]<0){
                low++;
            }
            while (arr[high]>=0){
                high--;
            }
            if(low<high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

            }

            //* The exact time complexity of this approach is O(n+2).
            // The time complexity is O(n).
        }
    }
    public static void main(String[] args) {
        int arr[]={-6,3,-8,10,5,-7,-9,12,-4,2};
        MoveNegOnTheLeft(arr);
        for(int i: arr){
            System.out.print(i+"  ");
        }
    }
}
