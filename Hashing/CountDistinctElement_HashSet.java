package ProblemSolving.Hashing;

import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class CountDistinctElement_HashSet {
    public static int countDistinctElement(int arr[]){
        //* Time complexity of this approach is O(n).
        HashSet<Integer> h=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            h.add(arr[i]);
        }
        return h.size();
    }

    public static int EfficentlyCount(Integer arr[]){
        HashSet<Integer> s=new HashSet<>(Arrays.asList(arr));
        return s.size();
    }
    public static void main(String[] args) {
        int arr[]={10,20,10,20,30};
        int size=countDistinctElement(arr);
        System.out.println(size);

        //* Now let's see more efficient solution.
        Integer[] l=new Integer[arr.length];
        for(int i=0; i<arr.length; i++){
            l[0]=(Integer)arr[i];
        }
        size=EfficentlyCount(l);
        System.out.println("size = " + (size+1));
    }
}
