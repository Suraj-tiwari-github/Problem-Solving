package ProblemSolving.Hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class Count_non_repeated_element {
    public static  int firstNonRepeating(int arr[], int n)
    {
        // Complete the function
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(Integer num : arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey() +" "+entry.getValue());
                return entry.getKey();
            }
            System.out.println(entry.getKey() +" "+entry.getValue());
        }

        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,6,7};
        System.out.println(firstNonRepeating(arr,arr.length));
    }
}
