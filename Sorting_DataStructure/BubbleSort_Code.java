package ProblemSolving.Sorting_DataStructure;

public class BubbleSort_Code {
    public static void sorting_bubbleSort(Integer  arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped=false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    //* I have done swapping by using XOR operation a=a+b, b=a-b , a=a-b;
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,8,3,9,6,2,10,7,4};
        Integer arr1[]={1,2,3,4,5,6,14,8,9,10};
        sorting_bubbleSort(arr1);
        for(Integer i:arr1){
            System.out.println(i);
        }
    }
}
