package ProblemSolving.Sorting_DataStructure;

public class practice {
    public static void heapify(int arr[], int parent, int n){
        int i=parent;
        int lchild=2*i+1;
        int rchild=2*i+2;

        if(lchild<n && arr[lchild]>arr[parent])
            parent=lchild;

        if(rchild<n && arr[rchild]>arr[parent])
            parent=rchild;

        if(parent!=i){
            arr[parent]+=arr[i];
            arr[i]=arr[parent]-arr[i];
            arr[parent]-=arr[i];
            heapify(arr,i,n);
        }
    }
    public static void maxHeap(int arr[], int n){
        if(n>1){
            for(int i=(n-1)/2; i>=0; i--){
                heapify(arr,i,n);
            }

            for(int i=n; i>0; i--){
                arr[i]=arr[i]+arr[0];
                arr[0]=arr[i]-arr[0];
                arr[i]=arr[i]-arr[0];

                heapify(arr,0,i);
            }
        }


    }
    public static void main(String args[]) {
        int arr[] = { 10,15,50,4,20 };
        int n = arr.length-1;
        maxHeap(arr, n);

        for (int i = 0; i < arr.length; i++)
            System.out.print("  " + arr[i]);

    }
}
