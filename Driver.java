/* Author: Joseph Gormley 
   Date: 12/6/17 */

import java.util.*;
public class Driver {
	
	public static void main(String[] args){

                System.out.println("MinHeap Test: ");
              
		// Create MinHeap.
                MinHeap heap = new MinHeap(6);
 
                heap.insert(3);
                heap.insert(2);

                System.out.println();
 
                heap.insert(8);
                heap.insert(5);
                heap.insert(9);
                heap.printHeap();
                
                System.out.println();
                System.out.println("The min was: " + heap.removeMin());
                System.out.println();
                heap.printHeap();

	}

}
