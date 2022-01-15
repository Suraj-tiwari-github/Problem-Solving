package ProblemSolving.Sorting_DataStructure.Collections_Demo;

import java.util.*;

class Point implements Comparable<Point>{
    int x, y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int compareTo(Point p){
        return this.x-p.x;
    }
}

class Comparator_Point {
    int x, y;

    public Comparator_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyComparator implements Comparator<Comparator_Point> {
    public int compare(Comparator_Point p1, Comparator_Point p2){
        return p1.x-p2.x;
    }
}

public class sort_Demo {
    public static void main(String args[]){
        List<Integer> li=new LinkedList<>();
        List<Integer> li_reverse=new ArrayList<>();
        List<Point> li_p=new LinkedList<>();
        List<Comparator_Point> Comparator_li=new ArrayList<>();
        li.add(5);
        li.add(1);
        li.add(10);

        li_reverse.add(1);
        li_reverse.add(2);
        li_reverse.add(3);
        li_reverse.add(4);

        // sorting this ascending fashion.
        Collections.sort(li);
        for(int i:li){
            System.out.println(i);
        }

        System.out.println("\n\n");
        // sorting in reverse order
        Collections.sort(li_reverse, Collections.reverseOrder());
        for(int i: li_reverse){
            System.out.println(i);
        }

        li_p.add(new Point(5,3));
        li_p.add(new Point(10,4));
        li_p.add(new Point(5,2));
        li_p.add(new Point(10,5));

        Collections.sort(li_p);
        for(Point i:li_p){
            System.out.println(i.x + "  "+ i.y);
        }

        Comparator_li.add(new Comparator_Point(10,2 ));
        Comparator_li.add(new Comparator_Point(10,1 ));
        Comparator_li.add(new Comparator_Point(11,2 ));
        Comparator_li.add(new Comparator_Point(9,2 ));
        Comparator_li.add(new Comparator_Point(1,2 ));
        Collections.sort(Comparator_li, new MyComparator());

        for(Comparator_Point p:Comparator_li){
            System.out.println(p.x + "  " + p.y );

        }


    }
}
