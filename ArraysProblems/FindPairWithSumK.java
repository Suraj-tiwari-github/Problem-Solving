package ProblemSolving.ArraysProblems;

public class FindPairWithSumK {
    public static void findPair(int arr[],int givenSum){
        int temp=0;
        for(int i=0; i<arr.length; i++){
            temp=givenSum-arr[i];
            if(temp>0){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j]==temp){
                        System.out.println(temp + "+" +arr[i]+"="+givenSum);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,8,10,16,7,5,2,9,14};
        findPair(arr,10);
    }
}
