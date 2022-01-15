package ProblemSolving.ArraysProblems;

import java.util.Arrays;
/*Problem Description:
* Given input n=5 [10,20,10,20,30]
* We need to count the distinct numbers in the array, if same number is repeated count increment only by once.
* output: 3
* * input: [30,50,80,30,60,50,80]
* Ouput: 4.
* */
public class CountDistinctElement {

    public static int countDistinct(int arr[]){
        int count=0;
        boolean temp=false;
        for(int i=0; i<arr.length; i++){
            temp=false;
            for(int j=i-1; j>=0; j--){
                if(arr[i]==arr[j]){
                    temp=true;
                    break;
                }
            }
            if(temp!=true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={30,50,80,30,60,50,80};
        System.out.println(countDistinct(arr));
        //* Here we are going to sort the arr
        Arrays.sort(arr);
        for(int i: arr)
        System.out.println(i);

    }
}
