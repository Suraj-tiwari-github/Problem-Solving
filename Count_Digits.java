package ProblemSolving;

public class Count_Digits {
    public static void main(String[] args) {
        int a=12345;
        int count=0;
        while(a!=0) {
            count++;
            a = a / 10;

        }
        System.out.println("Number of Digits: "+count);
    }
}
