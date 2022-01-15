package ProblemSolving.Searching;

public class Index_of_first_occurrence {
    public static int findFirstIndex(int arr[], int low, int high, int key){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(key>arr[mid]){
            return findFirstIndex(arr,mid+1,high,key);
        }
        else if(key<arr[mid]){
            return findFirstIndex(arr,low,mid-1,key);
        }
        if(mid==0 || arr[mid]!=arr[mid-1]){
            return mid;
        }
        else{
            //* call recursive for opposite order to search whether
            //* a same element do exist earlier or not. because we need to return
            //* The first occurrence of the element.
            return findFirstIndex(arr,low,mid-1,key);
        }
    }

    public static int naiveMethod(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }

        }
        return -1;
    }

    public static int IterativeFindFirstIndex(int arr[], int key){
        if(key>arr[arr.length-1]){
            return -1;
        }
        if(key==arr[arr.length-1]){
            return 0;
        }
        int low=0;
        int high=arr.length-1;
        int mid=0;

        while(low<=high){
            mid=(low+high)/2;

            if(key>arr[mid]){
                low=mid+1;
            }
            else if(key<arr[mid]){
                high=mid-1;
            }
            else{
                if(mid==0 || arr[mid]!=arr[mid-1]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3,3, 4,4,4, 5, 6, 7, 8,8,8, 9, 10};
//        int arr[]={1,2,1,1,1,1,1,1};
        //* Here we need to find out the first occurrence of element in an array and return the index.
        System.out.println(findFirstIndex(arr,0,arr.length-1,4));
        System.out.println(naiveMethod(arr,4));
        System.out.println(IterativeFindFirstIndex(arr,4));
    }
}
