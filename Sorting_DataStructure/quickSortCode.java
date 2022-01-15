package ProblemSolving.Sorting_DataStructure;

import java.util.Random;
import java.lang.Math;
public class quickSortCode {
    public static int RandomizedPartition(int arr[], int beg, int end){
        int pivotIndex=(int)Math.random()*(end-beg+1)+beg;
        System.out.println(pivotIndex);
        int temp=arr[pivotIndex];
        arr[pivotIndex]=arr[end];
        arr[end]=temp;
        return partitionIndexLomuto(arr,beg,end);
    }

    public static int partitionIndexLomuto(int arr[], int beg, int end){
        int pIndex=beg;
        int pivot=arr[end];
        for(int i=beg; i<end; i++){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[pIndex];
                arr[pIndex]=temp;
                pIndex++;
            }
        }
        int temp=arr[pIndex];
        arr[pIndex]=arr[end];
        arr[end]=temp;

        return pIndex;
    }

    public static int HoarePartition(int arr[], int beg, int end) {
        int pivot = arr[beg];
        int i = beg - 1;
        int j = end + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }
            //* If the above condition is not true, swap.
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
    public static void quickSort(int arr[], int beg, int end){
        if(beg<end){
            int getPartitionIndex=HoarePartition(arr,beg,end);
            quickSort(arr,beg,getPartitionIndex);
            quickSort(arr,getPartitionIndex+1,end);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,3,9,6,2,10,7,4};
        quickSort(arr,0, arr.length-1);
        for(int i: arr){
            System.out.print(i +"  ");
        }
    }
}
