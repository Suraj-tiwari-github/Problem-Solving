package ProblemSolving.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class Winner_of_an_election
{
    //* Print the name of candidate that received Max votes. If there is tie, print lexicographically smaller name.
    public static String[] winner(String arr[], int n)
    {
        HashMap<String, Integer> h=new HashMap<>();
        for(String s:arr){
            h.put(s, h.getOrDefault(s,0)+1);
        }

        Arrays.stream(arr).sorted(); //* This line is use to sort the string array element.
        String s[]={arr[0],Integer.toString(h.get(arr[0]))};

        return s;
    }
    public static void main(String[] args) {
        String Votes[] = {"john","johnny","jackie","johnny","john",
                "jackie","jamie","jamie","john","johnny","jamie",
                "johnny","john"};
        String test[]={"andy", "blake", "clark"};

        String temp[]=winner(Votes, Votes.length);

        for(String s:temp){
            System.out.print(s+"  ");
        }
        temp=winner(test,test.length);
        for(String s:temp){
            System.out.print(s+"  ");
        }
    }
}
