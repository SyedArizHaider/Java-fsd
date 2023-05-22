package com.test;

import java.util.Arrays;
public class QueueDemo{

	private long[] items;

	public static void main(String[] args) {

		Queue myQ = new Queue();

		myQ.enQueue(10);
		myQ.enQueue(20);

		System.out.println("Queue currently is " + Arrays.toString(myQ.items));

		myQ.enQueue(30);

		// For quick check of all the current elements of the queue
		System.out.println("Queue currently is " + Arrays.toString(myQ.items));
myQ.display();
		
		System.out.println("Dequeing ... " + myQ.deQueue());
		//System.out.println("Queue currently is " + Arrays.toString(myQ.items));
		myQ.display();

	}
	private void enQueue(int i) {
		// TODO Auto-generated method stub
		
	}

}

class Queue {

	int front, rear;

	int SIZE = 5;

	int[] items = new int[SIZE];

	// Initialize empty queue
	Queue() {
		front = -1;
		rear = -1;
	}

	//// helper methods
//// helper methods

	boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	boolean isFull() {
		if (front == 0 && rear == SIZE - 1) {
			return true;
		}
		return false;
	}

	//// main operations

	void enQueue(int element) {

		// check for space to add
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			// element is the first item to get added to the queue
			if (front == -1)
				front = 0;

			rear++;
			items[rear] = element;

			System.out.println("Inserted " + element);
		}

	}
	int deQueue() {
		int deQueuedVal = -1;

		if (isEmpty()) {
			System.out.println("Empty Queue");
			return deQueuedVal;
		} else {

			deQueuedVal = items[front];

			// is this last data in the queue that was removed
			if (front >= rear) {
				front = -1;
				rear = -1;
			}			
			
		}

		return deQueuedVal;
	}
void display() {
		
		int i;
	    if (isEmpty()) {
	      System.out.println("Empty Queue");
	    } else {
	      System.out.println("Items -> ");
	      for (i = front; i <= rear; i++)
	        System.out.print(items[i] + "  ");

	      
	    }
	}
}
