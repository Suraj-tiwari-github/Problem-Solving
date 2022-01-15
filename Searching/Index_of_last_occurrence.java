package ProblemSolving.Searching;

public class Index_of_last_occurrence {
    public static int findFirstLast(int arr[], int low, int high, int key){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(key>arr[mid]){
            return findFirstLast(arr,mid+1,high,key);
        }
        else if(key<arr[mid]){
            return findFirstLast(arr,low,mid-1,key);
        }
        if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
            return mid;
        }
        else{
            //* call recursive for opposite order to search whether
            //* a same element do exist earlier or not. because we need to return
            //* The first occurrence of the element.
            return findFirstLast(arr,mid+1,high,key);
        }
    }

    public static int naiveMethod(int arr[], int key){
        for(int i=arr.length-1; i>0; i--){
            if(arr[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static int IterativeFindLastIndex(int arr[], int key){
        if(key>arr[arr.length-1]){
            return -1;
        }
        if(key==arr[arr.length-1]){
            return arr.length-1;
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
                if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    low=mid+1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3,3, 4,4,4, 5, 6, 7, 8,8,8, 9, 10};
        int arr1[]={8,8,8,8,8,8};
        System.out.println(naiveMethod(arr,8));
        System.out.println(findFirstLast(arr,0,arr.length-1,8));
        System.out.println(IterativeFindLastIndex(arr,8));

    }
}
