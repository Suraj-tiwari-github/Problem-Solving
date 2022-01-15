package ProblemSolving.Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("Suraj");
        h.add("Tiwari");
        h.add("Software Enginner");

        System.out.println(h);
        System.out.println(h.contains("Tiwari"));

        Iterator<String> i=h.iterator();
        while(i.hasNext())
            System.out.println(i.next()+" ");

        System.out.println("Size of Hash set is :"+h.size());

        h.remove("Tiwari");

        System.out.println("New size of Hash set is: "+h.size());
        for(String s: h){
            System.out.println(s +" ");
        }

        System.out.println("Hash is Empty: "+h.isEmpty());

        h.clear();
        System.out.println("Hash is Empty: "+h.isEmpty());
    }
}
