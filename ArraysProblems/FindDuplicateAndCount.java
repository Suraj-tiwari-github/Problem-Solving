package ProblemSolving.ArraysProblems;

public class FindDuplicateAndCount {
    public static int findAndCountDuplicateSuraj(int arr[]){
        int count=1;
        int lastDuplicate=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1] && arr[i]!=lastDuplicate){
                System.out.println(arr[i]);
                count++;
                lastDuplicate=arr[i];
            }
            System.out.println(arr[i] + "Count= "+count);
        }
        return count;
    }

    public static void SirAbdulBarifindAndCountDuplicate(int arr[]){
        int lastDuplicate=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                int j=i;
                while(arr[j]==arr[i]){
                    if(j<arr.length-1)
                        j++;
                    else{
                        if(j==arr.length-1){
                            break;
                        }
                    }
                }
                i=j-1;
                System.out.println("Count of "+arr[i]+" is :"+ (j-i+1));
            }
        }

    }

    public static int findMax(int arr[]){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void fillZero(int arr[]){
        for(int i: arr) {
            arr[i] = 0;

        }

    }
    public static void findDuplicateAndCountHashTable(int arr[]){
       int max=findMax(arr);
       int result[]=new int[max+1];
       fillZero(result);

       for(int i=0; i<arr.length; i++){
           result[arr[i]]++;
       }

       for(int i=0; i<result.length; i++){
           if(result[i]>1){
               System.out.print(i +" Count is : "+result[i] +"  ");
           }
       }
    }
    public static void main(String[] args) {
        int arr[]={3,6,8,8,10,12,15,15,20};
//            System.out.println(findAndCountDuplicateSuraj(arr));
//       SirAbdulBarifindAndCountDuplicate(arr);
        findDuplicateAndCountHashTable(arr);
    }
}
