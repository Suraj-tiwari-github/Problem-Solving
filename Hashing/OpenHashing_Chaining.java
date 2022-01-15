package ProblemSolving.Hashing;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
    Node(){

    }
}


public class OpenHashing_Chaining {
    public static Node insertFirst(int data, Node temp){
        if(temp==null){
            temp.data=data;
            return temp;
        }
        else{
            Node newHead=new Node(data);
            newHead.next=temp;
            temp=newHead;
            return temp;
        }
    }

    public static Node insertLast(int data, Node head){
        if(head==null){
            Node newNode=new Node(data);
            head=newNode;
            return head;
        }
        else{
            Node itr=head;
            while(itr.next!=null){
                itr=itr.next;
            }
            Node newNode=new Node(data);
            itr.next=newNode;
            return head;
        }

    }

    public static int searchNode(int data, Node head){
        while(head!=null){
            if(head.data==data){
                return data;
            }
            head=head.next;
        }
        return -1;
    }

    public static void deleteNode(int data, Node head){
        while(head.next!=null){
            if(head.next.data==data)
                head.next=head.next.next;
            head=head.next;
        }

    }

    public static void printList(Node head, int count){
        System.out.println("The new List for :"+count);
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

        System.out.println("\n\n");
    }

    public static Node sortedInsert(int data,Node head){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        else {
            Node temp = head;
            Node toInsert = head;
            while (temp != null) {
                if (temp.data < data) {
                    toInsert = temp;
                    temp = temp.next;

                }else
                    break;
            }
                newNode.next=temp;
                toInsert.next = newNode;
            }


        return head;
    }

    public static int hashFun(int key){
        return key%10;
        //* this is our hash Function
    }

    public static void insertInHashTable(Node temp[], int key){
        int index=hashFun(key);
        //* hashFun will return the index , where the element should be inserted.
        //* in SortedInsert, we are calling the array of Linked List to store at given index by the hashFun
        temp[index]=sortedInsert(key,temp[index]);
    }
    public static void main(String[] args) {
        //* Hashing is technique where the searching,insertion and deletion takes contain time O(1).
        //* here the chaining describe as we are going to store the head node of each linkedList in the respective
        //* index of the hash table,
        //* The Hash function for our chaining will be h(x)=x%10. which is the last digit of a number.

        Node hashTable[]=new Node[10];
//        Node Head=new Node(10);
//
//        Head=insertFirst(9,Head);
//        Head=insertFirst(9,Head);
//        Head=insertFirst(8,Head);
//        Head=insertFirst(7,Head);
//        Head=insertFirst(6,Head);
//        Head=insertFirst(5,Head);
//
//        Head=insertLast(20,Head);
//
//        printList(Head);
//
//        System.out.println(searchNode(10, Head));
//        deleteNode(20,Head);
//        printList(Head);

        insertInHashTable(hashTable,12);
        insertInHashTable(hashTable,22);
        insertInHashTable(hashTable,42);

        int count=0;
        for(Node i:hashTable){
            printList(i, count);
            count++;
        }

        System.out.println(searchNode(21,hashTable[hashFun(22)]));



    }
}
