package ProblemSolving.ArraysProblems;

//* TO merge two array the array should be sorted, Then only we can say merging.
//* If two array is not sorted then we have other functions like append an array to different array.
//* Concat the array 1 and array 2 into the new array.
//* Copy the array into a different array.

public class MergeTwoSortedArray {
    public static int[] mergeArray(int arr1[], int arr2[]){

        // The Time complexity of this approach is O(m+n): Because there are m element in the array 1.
        // and N elements in the array2. Copying array1 and array2 into the new array.

        int i=0;
        int j=0;
        int k=0;
        int result[]=new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                result[k++]=arr1[i++];
            }
            else{
                result[k++]=arr2[j++];
            }
        }

        while(i<arr1.length){
            result[k++]=arr1[i++];
        }
        while(j<arr2.length){
            result[k++]=arr2[j++];
        }

        return result;
    }
    public static void main(String[] args) {
        int arr1[]={3,8,16,20,25};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result[]=mergeArray(arr1,arr2);
        for(int i: result){
            System.out.print(i+"  ");
        }
    }
}
