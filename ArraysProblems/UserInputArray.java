package ProblemSolving.ArraysProblems;

import java.util.Scanner;
public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to Enter: ");
        int n=sc.nextInt();
        //* now let's create an array of size n.
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter for "+ i+1 +" Value:");
            arr[i]=sc.nextInt();
            System.out.flush();
        }

        for(int x:arr){
            System.out.print(x + ",  ");
        }
    }
}
