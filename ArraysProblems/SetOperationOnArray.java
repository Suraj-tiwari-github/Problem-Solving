package ProblemSolving.ArraysProblems;

public class SetOperationOnArray {
    public static int[] findUnion(int A[], int B[]){
        //* Time complexity of this approach is : O(m+m*n) => O(n+n*n)=> O(n^2)
        //* See under Array ADT(Data structure notes)-> setOperation.
        int result[]=new int[A.length+B.length];
        int index=0;
        int k=0;
        for(int i=0; i<A.length; i++, k++){
            result[k]=A[i];
        }
        for(int i=0; i<B.length; i++){
            boolean toStore=true;
            for(int j=0; j<A.length; j++){
                if(B[i]==A[j]){
                    toStore=false;
                }

            }
            if(toStore){
                result[k++]=B[i];
            }
        }
        return result;
    }

    public static int[] findIntersection(int arr[], int arr1[]){
        int result[]=new int[arr.length];
        int k=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr1.length ;j++){
                if(arr[i]==arr1[j]){
                    result[k++]=arr[i];
                    break;
                }
            }
        }
        return result;
    }

    public static int[] findDifference(int A[], int B[]){
        //The definition of Difference is to find all the elements of A which are not present in the
        // the element of B.

        int result[]=new int[A.length];
        for(int i=0,k=0; i<A.length; i++){
            boolean flag=true;
            for(int j=0; j<B.length; j++){
                if(A[i]==B[i]){
                    flag=false;
                }
            }
            if(flag==true){
                result[k++]=A[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int A[]={3,8,4,2,25};
        int B[] = {12,4,7,2,25};

        int union[]=findUnion(A,B);
        System.out.println("Union of the result is :");
        for(int i: union){
            System.out.print(i +"  ");
        }

        int intersection[]=findIntersection(A,B);
        System.out.println("\n\n Intersection is: ");
        for(int i: intersection){
            System.out.print(i +"  ");
        }

        int difference[]=findDifference(A,B);
        System.out.println("\n\nDifference A-B is");
        for(int i: difference){
            System.out.print(i +"  ");
        }
    }
}
