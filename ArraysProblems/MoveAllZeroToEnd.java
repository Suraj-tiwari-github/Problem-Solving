package ProblemSolving.ArraysProblems;

public class MoveAllZeroToEnd {
    public static void moveZero(int arr[]){
        int zero=0, k=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zero=i-k;
                k++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[zero];
                arr[zero]=temp;

                zero++;
            }
        }

        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void moveZeroGFG(int arr[]){
        int res=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[res];
                arr[res] = temp;
                res++;
            }

        }

        for(int i: arr){
            System.out.print(i +"  ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,10,10};
//        moveZero(arr);
        moveZeroGFG(arr);
    }
}
