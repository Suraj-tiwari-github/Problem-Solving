package ProblemSolving.Sorting_DataStructure;

public class mergeSortCode {
    public static void merge(int arr[],int low, int mid, int high){
        int tempArr[]=new int[high+1];
        int l=low;
        int gMid=mid+1;
        int index=low;

        while(l<=mid && gMid<=high){
            //* l is lower the range of array will be low to mid for the first array.
            //*  mid+1 to high is the range of second array.
            if(arr[l]<arr[gMid]){
                //* If the first array of first index is less than the second array of first index.
                //* store the value in tempArr
                tempArr[index++]=arr[l++];
            }
            else{
                tempArr[index++]=arr[gMid++];
            }
        }

        //* if any array elements are left to be inserted due to completion of any of the two array.

        while(l<=mid){
            tempArr[index++]=arr[l++];
        }

        while(gMid<=high){
            tempArr[index++]=arr[gMid++];
        }

        //* assign back all the values of temp array into the original array.
        for(int i=low; i<=high; i++){
            arr[i]=tempArr[i];
        }


    }

    public static void mergeSort(int arr[],int low, int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,3,9,6,2,10,7,4};
        mergeSort(arr,0, arr.length-1);
        for(int i: arr){
            System.out.print(i +"  ");
        }
    }
}
