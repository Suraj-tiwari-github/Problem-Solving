package ProblemSolving.Sorting_DataStructure;

import java.util.Arrays;

public class SelectionSort_Code {
    public static int findMinIndex(Integer arr[],int index){
        int min=arr[index];
        int k=index;
        for(int i=index; i<arr.length; i++){
            if(arr[i]<min){
                k=i;
                min=arr[i];
            }
        }
        return k;
    }
    public static void selectionSort(Integer arr[]){
        for(int i=0; i<arr.length-1; i++){
            //* we are skipping the last element, because when their is one element in the list
            //* which is not sorted, And all the remaining elements are sorted, Then It is at
            //* its correct position.
            int min=findMinIndex(arr, i);
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,8,3,9,6,2,10,7,4};
        selectionSort(arr);
        for(Integer i: arr){
            System.out.print(i +"  ");
        }
    }
}
