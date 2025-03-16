//https://bit.ly/3PA7mY0

public class queueLL {
    static class QueueNode {
        int val;
        QueueNode next;

        QueueNode(int data) {
            val = data;
            next = null;
        }
    } 

    private QueueNode front = null, rear = null;
    private int size = 0;

    boolean isEmpty() {
        return front == null;
    }  

    int peek() {
        if (isEmpty()) {  
            System.out.println("Queue is empty, no element to peek");
            return -1;
        } 
        return front.val;
    }   

    void enqueue(int value) {
        QueueNode temp = new QueueNode(value);
        if (front == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        System.out.println(value + " inserted into Queue");
        size++;
    }      

    int dequeue() { 
        if (front == null) {
            System.out.println("Queue is empty, cannot dequeue");
            return -1;
        }  
        int removedValue = front.val;
        front = front.next;
        if (front == null) { 
            rear = null;
        }
        size--;
        return removedValue;
    }  

    public static void main(String args[]) {
        queueLL queue = new queueLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.dequeue() + " removed from Queue");
        System.out.println("The size of the Queue is " + queue.size);
        System.out.println("The Peek element of the Queue is " + queue.peek());
    }
}