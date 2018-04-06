/*  Author: Joseph Gormley
    Date: 4/4/2018 */

import java.lang.Math;

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

       int i = size;
       // Swap if necessary. 
       while(i != 0 && heap[parent(i)] > element ){
           swap(parent(i), i); 
           i = parent(i);
       }

       // Update size.
       size++;
        
       return;
    } 

    public int removeMin(){

        int ret = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = 0; 
        size--;

        removeMinWrapped(ret);

        return ret;
        
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

    private void bubbleDown(int indexA, int indexB){
 
        int tmp = heap[indexA];



        return;
    }

    public void printHeap(){

        for(int index = 0; index < size; index++){
            System.out.println("Index: " + index + " has a value of " + heap[index] + ".");
        }

    }

   /***********************
    * WRAPPED FUNCTION(S) *
    ***********************/
    public void removeMinWrapped(int index){

        int minIndex = index;
        if(leftChild(index) < size && heap[index] > heap[leftChild(index)]){
           minIndex = leftChild(index);
        }
      
        if(rightChild(index) < size && heap[rightChild(index)] < heap[minIndex]){
           minIndex = rightChild(index);
        }
      
        if(minIndex == index){
          swap(index, minIndex);
          removeMinWrapped(minIndex); 
        }
      
        return;
    }

    
}


