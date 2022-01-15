package ProblemSolving.ArraysProblems;

public class CheckArraySorted {

    public static String isArraySorted(int arr[]){
        if(arr.length<=1){
            return "Yes";
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i])
                return "No";
        }
        return "Yes";
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,5,3};

        System.out.println(isArraySorted(arr));
    }
}
