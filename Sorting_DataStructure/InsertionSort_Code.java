package ProblemSolving.Sorting_DataStructure;

public class InsertionSort_Code {
    public static void InsertionSortSurajMethodNotRecommenend(Integer arr[]){
        for(int i=1; i<arr.length; i++){
            //My Method makes the number of comparison more when compared with GFG methods,
            // My method keeps on decrementing to index 0 to find an element which is less than
            // the element we are looking to swap. see the note for better understanding.

            //* starting from 1 because 0 element is already sorted.
            //* on element 1, we compare that element 2 is less than element 1, if so swap.
            //* then we can say that. till element 2 we are sorted.
            //* again on element 3, we'll scan for the element where element 3 is less than element 2,
            //* if we found so, then we'll insert. and we keep on doing till we reach index 0.
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    //* swap
                    arr[j]=arr[j]+arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]=arr[j]-arr[j-1];
                }
            }
        }
    }

    public static void InsertionSortGFG(Integer arr[]){
        //* if index 0 is sorted, then we need to compare the index 1 with index 0 to findout
        // whether index 1 is less than index 0, if so replace index (0,1).
        // And increment the count of sorted list to index 1. So we are saying that index 0 and 1 are sorted.
        // suppose we have the sorted list till index 4. From index 0 to index 4 the list is sorted.
        // on index 5, to look for its correct position we just need to find where index 5 is less than the sorted
        // indexes of element.

        // when we found the index, where index 5 is smaller then break the loop and shift all the element to the right
        // and insert the index 5 at its correct index.

        for(int i=1; i<arr.length; i++){
            int key=arr[i];
            int tillSortedList=i-1;

            while(tillSortedList>=0 && arr[tillSortedList]>key){
                // swaps the element to the right because we didn't find the key smaller than tillSortedList
                // tillSortedList is leftSortedList.
                // swap towards right.
                arr[tillSortedList+1]=arr[tillSortedList];
                //* because we save the key so we are inserting the elements on index of key.
                tillSortedList--;
            }
            arr[tillSortedList+1]=key; /* On saving tillSortedList, we were decrementing the value by off 1, on saving
            we are incrementing by 1.*/
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,8,3,9,6,2,10,7,4};
//        Integer arr[]={1,2,3,4,5,6,14,8,9,10};
//        InsertionSortSurajMethodNotRecommenend(arr);
        InsertionSortGFG(arr);
        for(Integer i: arr){
            System.out.print(i +"  ");
        }
    }
}
