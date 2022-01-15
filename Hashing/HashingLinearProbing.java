package ProblemSolving.Hashing;

public class HashingLinearProbing {
    static int LinearProbe(int hash[],int key){
        int index=hashFunction(key);
        int i=0; // for finding the vacant space in the hash table.
        while(hash[index+i]%10!=0){
            i++;
        }
        return (index+i)%10;
    }

    static int hashFunction(int key){
        return key%10;
    }

    static void insert(int hash[], int key){
        int index=hashFunction(key);
        if(hash[index]!=0) // If the element to be inserted is not vacant, then we need to linear probe.
            index=LinearProbe(hash,key);

        hash[index]=key;

    }

    static int search(int hash[], int key){
        int index=hashFunction(key);
        int i=0;
        while(hash[(index+i)]!=key){
            i++;
        }
        return (index+i)%10;
    }
    public static void main(String[] args) {
        int hashTable[]=new int[10];

        insert(hashTable,12);
        insert(hashTable,25);
        insert(hashTable,35);
        insert(hashTable, 26);

        System.out.println(search(hashTable,26));


    }
}
