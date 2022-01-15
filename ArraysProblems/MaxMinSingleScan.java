package ProblemSolving.ArraysProblems;

public class MaxMinSingleScan {
    public static void findMin_Max(int arr[]){
        int min=arr[0];
        int max=arr[arr.length-1];

        for(int i=1, j=arr.length-2; i<arr.length && j>=0; i++,j-- ){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[j]>max){
                max=arr[j];
            }
        }

        System.out.println("Min="+min +"\n"+"Max="+max);
    }

    public static void AbdulBari_min_max(int arr[]){
        int min=arr[0];
        int max=min;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
                //* If the element is less than min, we don't have to check it further.
            }
            else{
                if(arr[i]>max){
                    max=arr[i];
                }
            }
        }
        System.out.println("Min="+min +"\n"+"Max="+max);
    }
    public static void main(String[] args) {
        int arr[]={5,8,3,9,6,2,10,7,-1,4};
        findMin_Max(arr);
        AbdulBari_min_max(arr);
    }
}
