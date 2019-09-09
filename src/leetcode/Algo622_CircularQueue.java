/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author naveen
 *
 * @date 28-Jul-2019
 */
public class Algo622_CircularQueue {

	public static void main(String[] args) {
		Algo622_CircularQueue queue = new Algo622_CircularQueue();

		MyCircularQueue circularQueue = queue.new MyCircularQueue(3); // set the size to be 3
		System.out.println(circularQueue.data);

		System.out.println("Add: " + circularQueue.enQueue(1)); // return true
		System.out.println(circularQueue.data);

		System.out.println("Add: " + circularQueue.enQueue(2)); // return true
		System.out.println(circularQueue.data);

		System.out.println("Add: " + circularQueue.enQueue(3)); // return true
		System.out.println(circularQueue.data);

		System.out.println("Add: " + circularQueue.enQueue(4)); // return false, the queue is full
		System.out.println(circularQueue.data);

		System.out.println("Rear: " + circularQueue.rear()); // return 3

		System.out.println("Full: " + circularQueue.isFull()); // return true

		System.out.println("Remove: " + circularQueue.deQueue()); // return true
		System.out.println(circularQueue.data);

		System.out.println("Add: " + circularQueue.enQueue(4)); // return true
		System.out.println(circularQueue.data);

		System.out.println("Rear: " + circularQueue.rear()); // return 4
	}

	class MyCircularQueue {

		int size = 0;
		int head = 0;
		int rear = 0;
		List<Integer> data = null;

		/** Initialize your data structure here. Set the size of the queue to be k. */
		public MyCircularQueue(int k) {
			size = k;
			data = new ArrayList<>(k);
		}

		/** Insert an element into the circular queue. Return true if the operation is successful. */
		public boolean enQueue(int value) {

			if (isFull()) {
				return false;
			}

			if (data.add(value)) {
				rear = data.size() - 1;
				return true;
			}

			return false;
		}

		/** Delete an element from the circular queue. Return true if the operation is successful. */
		public boolean deQueue() {

			if (isEmpty()) {
				return false;
			}

			data.remove(head);

			if (isEmpty()) {
				rear = 0;
			} else {
				rear = data.size() - 1;
			}

			return true;
		}

		/** Get the front item from the queue. */
		public int front() {

			if (isEmpty()) {
				return -1;
			}

			return data.get(head);
		}

		/** Get the last item from the queue. */
		public int rear() {

			if (isEmpty()) {
				return -1;
			}

			return data.get(rear);
		}

		/** Checks whether the circular queue is empty or not. */
		public boolean isEmpty() {
			return data.isEmpty();
		}

		/** Checks whether the circular queue is full or not. */
		public boolean isFull() {
			return size == data.size();
		}
	}
}