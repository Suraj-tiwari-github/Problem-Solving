package ProblemSolving.ArraysProblems;

import java.util.Scanner;

public class Insert_In_Sorted_Array {
    public static boolean InsertValue(int value, int arr[]){
        for(int i=arr.length-1; i>0; i--){
            if(value<arr[i-1]){
                arr[i]=arr[i-1];
            }
            else{
                arr[i]=value;
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]=new int[9];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<arr.length-1; i++){
            arr[i]=sc.nextInt();
        }

        if(InsertValue(18, arr)){
            System.out.println("Value is Inserted");
        }
        else{
            System.out.println("Value is not inserted");
        }

        for(int i: arr){
            System.out.print(i + " ");
        }

    }
}
