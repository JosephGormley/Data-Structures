public class MinHeap {
    
   /******************
    * CLASS FIELD(S) *
    ******************/
    int[] heap;
    int size;

   /************************
    * CLASS CONSTRUCTOR(S) *
    ************************/
    public MinHeap(int capacity){
        heap = new int[capacity];
        size = 0;
    }

   /*******************
    * CLASS METHOD(S) *
    *******************/
    public void insert(int element){

       // Insert element at the end of heap.
       heap[size] = element;

       // Swap if necessary. 
       if(size != 0 && heap[parent(size)] > element){ swap(parent(size), size); }

       // Update size.
       size++;
        
       return;
    } 

   /********************
    * HELPER METHOD(S) *
    ********************/
    private int leftChild(int i){ return (i * 2) + 1; }
  
    private int rightChild(int i){ return (i * 2) + 2; }

    private int parent(int i){ return (i - 1) / 2; }
 
    private void swap(int indexA, int indexB){ 

        int tmp = heap[indexA];

         // Swap.
         heap[indexA] = heap[indexB];
         heap[indexB] = tmp;

         return; 

    }

    public void printHeap(){

        for(int index = 0; index < size; index++){
            System.out.println("Index: " + index + " has a value of " + heap[index] + ".");
        }

    }
}


