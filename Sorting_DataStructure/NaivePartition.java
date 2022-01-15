package ProblemSolving.Sorting_DataStructure;
/*Given an array and a value, we need to partition the value as such that, all the elements lesser than the
* value given are toward the left of it and the elements which are greater than towards right of it.
* Solution: Create a temporary array and store all the elements which are lesser than the given element.
*   after that copy all the remaining element in the temp array.
*  */
public class NaivePartition {
    public static void partition(int arr[], int beg, int end, int index) {
        int temp[]=new int[end+1];
        int j=beg;
        for(int i=beg; i<=end; i++){
            if(arr[i]<arr[index])
                //* if the element is lesser than or equal to the given element, copy that element in our temp array.
                temp[j++] = arr[i];
        }
        temp[j++]=arr[index]; //* This is the line for copying the value after all the lesser element as been copyied in
        //*the temp array, for example 5 is the value given, 1,2 3,as been copied because 5 is greater than 1,2,3 now we
        //* we need to copy 5 after all the lesser element have been copied. then we can continue with greater element.
        //* At the end we'll have the solution.
        //* copy the remaining element to the temp array.
        for(int i=beg; i<=end; i++){
            if(arr[i]>arr[index])
                temp[j++]=arr[i];
        }
        //* copy all the elements of temp array to the original array.
        for(int i=beg; i<=end; i++)
            arr[i]=temp[i];
    }
    public static void main(String[] args) {

        int arr[]={5,8,3,9,6,2,10,7,4};
        partition(arr,0, arr.length-1,0);
        for(int i: arr){
            System.out.print(i +"  ");
        }
    }
}
