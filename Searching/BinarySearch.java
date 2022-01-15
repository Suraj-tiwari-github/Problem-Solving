package ProblemSolving.Searching;

public class BinarySearch {
    public static int binarySearchRecursive(int arr[], int key, int low,int high){
        if(low>=high){
            return -1;
        }
        int mid=(low+high)/2;
        if(key==arr[mid]){
            return mid;
        }
        else if(key>arr[mid]){
            return binarySearchRecursive(arr,key,mid+1,high);
        }
        else{
            return binarySearchRecursive(arr, key,low,mid-1);
        }



    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int key=10;
        while(low<=high){
            mid=(low+high)/2;
            if(key==arr[mid]){
                System.out.println(key);
                break;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }

        System.out.println(binarySearchRecursive(arr,8,0,arr.length-1));
    }
}
