package ProblemSolving.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrayElements {

    public static void GFGMethod(int arr[]){
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int x:arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> e: h.entrySet()){
            System.out.println(e.getKey() +"  "+ e.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]={10,12,10,15,10,20,12,12};
        GFGMethod(arr);
        HashMap<Integer, Integer> h=new HashMap<>();
        h.put(arr[0],1);
        for(int i=1; i<arr.length; i++){
            if(h.containsKey(arr[i])){
                int count=h.get(arr[i]);
                count++;
                h.put(arr[i],count);
            }
            else{
                h.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> m: h.entrySet()){
            System.out.println(m.getKey() +"  "+m.getValue());
        }
    }
}
