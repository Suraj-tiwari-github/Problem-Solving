package ProblemSolving.ArraysProblems;

public class FindSecondLargestNumberInArray {

    public static int getLargest(int arr[]){
        if(arr.length<1){
            return 0;
        }
        int max=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static int getSecondLargest(int arr[]){
        //* The time Compleixty of getSecondLargest is O(n). with two iteration.
        int largest=getLargest(arr); //* Time Complexity: O(n) to for getLargest.
        //* here we got a max element from the array, now we need to findout the second largest element.
        int secondMax=-1;
        for(int i=0; i<arr.length; i++){ // O(n).
            if(arr[i]!=arr[largest]){
                if(secondMax==-1){
                    secondMax=i;
                }
                else{
                    if(arr[i]>arr[secondMax]){
                        secondMax=i;
                    }
                }
            }

        }
        return secondMax;
    }

    public static int getSecondLargestInOneIteration(int arr[]){
        int temp=arr[1];
        int max=arr[0];
        for(int i=2; i<arr.length; i++){
            if(arr[i]>temp){
                if(arr[i]>=max){
                    max=arr[i];
                    continue;
                }
                temp=i;
            }
        }
        if(temp==arr[0]){
            return -1; //* If the elements are same in the array, return -1.
        }
        else{
            return temp;
        }
    }

    public static int gfgApproach(int arr[]){
        int result=-1, largest=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[largest]){
                result=largest; //* This is a general case.
                largest=i;
            }
            else if(arr[i]!=arr[largest]){
                if(result==-1 || arr[i]>arr[result]){
                    result=i;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,10,10,10};
        int secondMax=getSecondLargest(arr);
        if(secondMax>-1)
        System.out.println(arr[secondMax]);
        else{
            System.out.println(-1);
        }

        //* We were doing it in two iteration, let's try to do it in one iteration.
        secondMax=getSecondLargestInOneIteration(arr);
        if(secondMax!=-1){
            System.out.println(arr[secondMax]);
        }
        else{
            System.out.println(-1);
        }

        secondMax=gfgApproach(arr);

    }
}
