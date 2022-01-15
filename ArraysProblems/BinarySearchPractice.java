package ProblemSolving.ArraysProblems;

import java.util.Scanner;

public class BinarySearchPractice {
    public static int BinarySearch(int input, int low, int mid, int high, int arr[]) {
        if(input==arr[mid]){
            return  mid;
        }
        else{
            if(low<high){
                if(input<arr[mid]){
                    high=mid-1;
                    mid=(low+mid-1)/2;
                    return BinarySearch(input,low,mid,high,arr);
                }
                else{
                    low=mid+1;
                    mid=(low+high)/2;
                    return BinarySearch(input, low, mid, high, arr);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int mid=(arr.length-1)/2;
        int high=arr.length-1;
        System.out.println(BinarySearch(input,0 ,mid,high, arr));
    }
}
