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
        heap[size - 1] = 0; // Set back to default. 
        
        int index = 0;
        while(heap[index] > Math.min(heap[leftChild(index)], heap[rightChild(index)])){
            
            // Bubble down, swap with min. 
            if(heap[leftChild(index)] < heap[rightChild(index)]){
                 swap(index, leftChild(index)); 
                 index = leftChild(index);
            }else{
                 // TODO @ Myself: At bottom of bubbledown (at the leafs), it values an empty rightChild at 0 even if 0 is not in list. 
                 // Problem resides in here. 
                 if(rightChild(index) >= size){
                     swap(index, leftChild(index));
                 index = leftChild(index);
                 }else{
                     swap(index, rightChild(index));
                     index = rightChild(index);
                 }
            }


            // Are we at a leaf? 
            if(leftChild(index) >= size){
               break;
            }
        }

        // Update size.
        size--;

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
}


