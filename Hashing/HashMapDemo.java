package ProblemSolving.Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> m=new HashMap<>();
        m.put("Suraj",10);
        m.put("Tiwari",15);
        m.put("Covers", 20);

        System.out.println(m);

        System.out.println(m.size());

        //* Iterating over the hashMap
        for(Map.Entry<String, Integer> e: m.entrySet())
            System.out.println(e.getKey() + "  "+e.getValue());

        if(m.containsKey("Tiwari")) System.out.println("yes");
        else System.out.println("No");

        m.remove("Tiwari");
        System.out.println("Size: "+m.size());

        if(m.containsValue(10))
            System.out.println("yes");
        else
            System.out.println("No");

        System.out.println(m.get("Covers"));
        System.out.println(m.get("Tiwari"));
    }
}
