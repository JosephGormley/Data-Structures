/* Author: Joseph Gormley 
   Date: 12/6/17 */
public class Driver {
	
	public static void main(String[] args){

                System.out.println("Queue Test");
		System.out.println("----------\n");

		// Create queue.
                Queue<Integer> q = new Queue<Integer>();
                q.enQueue(3);
                q.enQueue(5);
                q.enQueue(1);
                q.deQueue();
                q.printQueue();
		System.out.println("\nTest complete!\n");

	}

}
