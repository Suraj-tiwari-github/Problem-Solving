public class HeapSort_Example {

    static void heapify(int arr[], int i, int n) {
        int parent = i;
        // * A formula to get a left and a right child by using i.
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && arr[leftChild] > arr[parent]) {
            parent = leftChild;
        }

        /*
         * A reason for not writing else part of the above if-statement because,
         * sometimes a left child will be greater than a root. And even they will be a
         * condition where rigth child is greater than the root and as well as greater
         * than left child. for comparing and finding the parent among the root,
         * leftchild and the right child. Two separete if condition are needed.
         */

        if (rightChild < n && arr[rightChild] > arr[parent]) {
            parent = rightChild;
        }

        /*
         * !if parent is not equal to i which means either from the above two
         * if-statement, any one of the element is greater than the parent node which is
         * i in this case.
         */
        if (parent != i) {
            int temp = arr[i];
            arr[i] = arr[parent];
            arr[parent] = temp;
            // * Call recursivly until the property of maxheap satisfies.
            // * Remember we need to send the new parent which we are re-arranging
            //* not the i index, which was a parent for previous call, prev 
            //* parent is a child now.
            heapify(arr, parent, n);
        }

    }

    static void performparentHeap(int arr[], int n) {
        // * here the n is 6 if off by one value is added, but we need a index 5
        //* here we are building the heap. Building a heap will cost a time of O(n).
        for (int i = (n -1)/ 2 ; i >= 0; i--) {

            // * The reason for writing n/2-1 remeber ( n/2-1 is same as (n-1)/2) This is for the parent formula)
            // is, In order to know the height of the
            //* Binary tree for n number of element, perform n-1/2 will give you
            //* the height. 
            //* This step perform the property of parent Heap(Max) that is, All the
            // * element(descendent) should be lesser than the root node.

            // * Parent formula: i-1/2;
            heapify(arr, i, n); // *Rearrange array.
            System.out.println("\nHeapify");
        }
        /*
         * After the above property, Max heap property is established,
         *  now we are ready to perform the sorting, which goes in this way
         * Take the first-element(root) which is the max and place it at the
         * end of the array. Make last node(element) in the tree as a new root
         * node and perform heapify again to make it again a maxHeap.
          
         */
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i]; // * We placed the first element in the last.
            arr[i] = temp;

            /*
             * Calling heapify for a reduced heap.
            
             * Why we wrote 0 and pass it to heapify Method which we is going to 
             * became a parent variable in method heapify. As Sorting is 
             * performed by placing the max(root node) to the end element and we 
             * make last(end) element(child) as a new parent node.
             * 
             * Every time we make a new parent node which is going to be place at
             * 0 index only.
            
             * i value will keep on decrementing, because at every call, the
             *  first max will be placed at correct index which is the last
             * index.And the 2nd Max element is placed at 2nd last element on an *array. 
             * then i will be decrementing and we keep on building a sorted
             *  array.
             */
            heapify(arr, 0, i);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
        performparentHeap(arr, n);

        for (int i = 0; i < arr.length; i++)
            System.out.print("  " + arr[i]);

    }
}
