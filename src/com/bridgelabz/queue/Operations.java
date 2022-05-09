package com.bridgelabz.queue;
import com.bridgelabz.linkedlist.Node;

public class Operations {
    Node front, rear;
    public void enqueue(int key)
    {
        Node temp = new Node(key);
        /*  If queue is empty, then new node is front and rear both */
        if (rear == null) {
            front = rear = temp;
        }
        else {
            /*  Add the new node at the end of queue and change rear    */
            rear.next = temp;
            rear = temp;
        }
        System.out.println(key+" added to the queue.");
    }
    public void dequeue()
    {
        /*  If queue is empty, return NULL  */
        if (front == null)
            return;
        /*  Store previous front and move front one node ahead  */
        Node temp = front;
        front = front.next;
        /*  If front becomes NULL, then change rear also as NULL    */
        if (front == null)
            rear = null;
    }
    public void print()
    {
        if (front == null) {
            System.out.printf("\nQueue is empty.");
        }
        else {
            System.out.print("Queue elements are ");
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
}
