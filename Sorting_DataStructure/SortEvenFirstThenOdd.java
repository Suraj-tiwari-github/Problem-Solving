package ProblemSolving.Sorting_DataStructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class Mycmp implements Comparator<Integer> {
    public int compare(Integer a, Integer b){
        return a%2-b%2;
        //* in this way we are returning first the Even number ( which means that
        /*
        * Even number will be printed in sorted order first then the odd number will
        * be printed.
        * */
    }
}
public class SortEvenFirstThenOdd  {

    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6,14,8,9,10};
        Integer arr1[]={5,8,3,9,6,2,10,7,4};
//        Arrays.sort(arr);
//        for(int i:arr){
//            System.out.println(i);
//        }

        Arrays.sort(arr1,new Mycmp());
        for(int i:arr1){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
