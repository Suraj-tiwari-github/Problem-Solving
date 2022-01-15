package ProblemSolving.ArraysProblems;

public class SingleMissingElementInArray {
    public static int findSingleMissingWithN_Natural(int arr[]){
        int n=arr[arr.length-1];
        int sum=n *(n+1)/2;
        //* Now scan the array and find the sum of it.
        int ArraySum=0;
        for(int i=0; i<arr.length; i++){
            ArraySum+=arr[i];
        }
        return sum-ArraySum;
    }

    public static int findSinMiss_Element_are_not_N_NaturalNumber(int arr[]){
        int low=arr[0];
        int n=arr.length;
        int high=arr[n-1];

        //* Let find the initial difference
        int diff=low-0;
        for(int i=0; i<n; i++){
            if(arr[i]-i!=diff){
                return diff+i;
                //* Whent he difference has changed, then we can say that the element has missed.
                //* to calcualte the missing element simply add the index with the difference.
            }
        }
        return 0;
    }

    public static void findMultipleMissingElement(int arr[]){
        int low=arr[0];
        int n=arr.length;
        int high=arr[n-1];

        int difference=low-0;
        for(int i=0; i<n; i++){
            if(arr[i]-i!=difference){
//                int temp=(arr[i]-i)-difference;
//                while(temp!=0){
//                    // This is my approach
//                    System.out.println(i+difference);
//                    temp--;
//                    difference=arr[i]-i;
//                }
                while(difference<arr[i]-i){
                    // This is sir Abdul Bari Appraoch
                    System.out.println(i+difference);
                    difference++;
                }
            }
        }
    }

    public static void findMultipleMissingElement_HashTable(int arr[]){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        //* let's create an array now.
        int newarr[]=new int[max+10];

        for(int i=0; i<arr.length; i++){
            newarr[arr[i]]++;
            //* we are incrementing the index of two array with the element of first array.
            //* element to index.
        }

        for(int i=1; i<newarr.length; i++){
            if(newarr[i]==0){
                System.out.println(i);
            }
        }


    }
    public static void main(String[] args) {
//        int arr[]={6,7,8,9,10,11,13,14,15,16,17};
//        System.out.println(findSinMiss_Element_are_not_N_NaturalNumber(arr));

//        int arr[]={1,2,3,4,5,7,8,9,10};
//        System.out.println(findSingleMissingWithN_Natural(arr));

        int arr[]={6,7,8,9,11,12,15,16,17,18,19};//* 10,13,14
        findMultipleMissingElement(arr);
        findMultipleMissingElement_HashTable(arr);
        int arr2[]={3,7,4,9,12,6,1,11,2,10}; //*
        findMultipleMissingElement_HashTable(arr2);

    }
}
