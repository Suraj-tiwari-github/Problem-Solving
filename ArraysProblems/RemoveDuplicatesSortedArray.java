package ProblemSolving.ArraysProblems;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int arr[]){
        int size=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                //* Removing same values and assigning zero in that places.
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        int count=-1;

        //* Moving all the zero to the end of the array.
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count=i;
                //* saving count value of index to place the value of an integer to make array sorted again.
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j]!=0){
                        arr[count]=arr[j]; //* Assigning the number at 0 values.
                        //* 10,20,0,0,40
                        //* this loop does
                        //* 10,20,40,0,0.
                        arr[j]=0;
                    }
                }
            }

        }

        for(int i:arr){
            System.out.println(i);
            if(i==0){
                size++;
            }
        }
        return arr.length-size;
    }

    public static int removeDuplicateOrderOfN(int arr[]){
        //* Creating a temp array to store distinct elements.
        int temp[]=new int[arr.length];
        temp[0]=arr[0]; //* no matter what the first element will be there in the distinct array.
        int result_size=1; //* 1 because we have already place a value in the temp array.

        //* traverse and copy the distinct element in the new array.

        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                temp[result_size]=arr[i];
                result_size++;

            }
        }

        //* now copy distinct element of temp array into the original array.
        for(int i=0; i<arr.length; i++){
            arr[i]=temp[i];
        }
        return result_size;
    }

    public static int removeDuplicateEfficient(int arr[]){
        //* checking if the length of the array is greater than 1 or not.
        if(arr.length<0){
            return -1;
        }
        int res=1; //* then they will be element where it's distinct so saving 1 in it.
        for(int i=1; i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,10,10};
        int arr_size=removeDuplicates(arr); //* removeDuplicate is written by suraj-> Time Complexity: O(n^2). space: O(1).
        System.out.println("The size of the array is: "+arr_size);

        //* Let's us now take an auxiliary array and copy this element only which are not repeated.
        //* The Time complexity of this approach is: theta of N.
        //* The Space complexity of this approach is : O(n).

        int arr2[]={10,20,20,30,30,30};
        arr_size=removeDuplicateOrderOfN(arr2);
        System.out.println("The order of n: "+arr_size);

        //* We need to return the size of the array with distinct elements.
        //* The efficient time and space is O(n) and O(1).

        int arr3[]={10,20,20,30,30,30,30};
        System.out.println(removeDuplicateEfficient(arr3));
    }
}
