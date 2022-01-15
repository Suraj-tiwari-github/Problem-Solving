package ProblemSolving.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashing_for_pair_1 {
    public static int sumExist(int arr[], int sum){
        int s=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            h.add(arr[i]);
        }

        for(int i=0; i<h.size(); i++){
            s=sum-arr[i];
            if(s!=arr[i])
                if(h.contains(s)){
                return 1;
            }
        }
        return 0;
    }
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String, Integer> h=new HashMap<>();
        for(String s:arr){
            h.put(s, h.getOrDefault(s,0)+1);
        }

        Arrays.stream(arr).sorted(); //* This line is use to sort the string array element.
        String s[]={arr[0],Integer.toString(h.get(arr[0]))};

        return s;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int arr1[]={2,5};
        int arr2[]={4,3,5,6};
        String Votes[] = {"john","johnny","jackie","johnny","john",
            "jackie","jamie","jamie","john","johnny","jamie",
                    "johnny","john"};
        int sum=12;
        System.out.println(sumExist(arr2,sum));
        String temp[]=winner(Votes, Votes.length);
        for(String s:temp){
            System.out.print(s+"  ");
        }
    }
}
