//
// Introduction to Computer Programming with Java
// TIEI - February 2017
//
package ObjectOrientedProgramming;

//import lists.ListNode;

//import lists.ListNode;
//import LinkedNode;

/**
 * An IntegerQueue class for assignment #9
 */
public class IntegerQueue {
	private LinkedNode front;
	private LinkedNode tail;
	private int size;


	/**
	 * Build an empty queue
	 */
	public IntegerQueue() {
		front = null;
		tail = front;
		size = 0;
	}

	/**
	 * Reset the queue (i.e. remove all
	 * elements in the queue)
	 */
	public void clear() {
		front = null;
		tail = front;
		size = 0;
	}

	/**
	 * Check if the queue is empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Return the size of the queue
	 * (i.e. the number of elements currently in the queue)
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Add the new integer 'n' in the queue
	 */
	public void offer(int n) {
		if (front == null) {
			front = new LinkedNode(n);
			tail = front;
		} else {
			tail.next = new LinkedNode(n);
			tail = tail.next;
		}
		size++;
	}
	
	public int peek() {
		if (front == null) return Integer.MIN_VALUE;
		else return front.data;
	}
 
	/**
	 * Remove and return the next element to be
	 * removed from the queue if the queue is not
	 * empty, do nothing and return 0 otherwise
	 */
	public int poll() {
		if (front == null) return Integer.MIN_VALUE;
		else {
			if (front.next == null) {
				int data = front.data;
				this.clear();
				return data;
			} else {
				int data = front.data;
				front = front.next;
				size--;
				return data;
			}
		}
		
	}

	// Private inner class for linked list node
	private class LinkedNode {

		// the data in the node
		public int data;
		// the link to the next node
		public LinkedNode next;

		// Build a new linked node with
		// the 'data' value as the data
		public LinkedNode(int data) {
			this.data = data;
			next = null;
		}
	}
}
