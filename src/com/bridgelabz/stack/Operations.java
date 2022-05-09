package com.bridgelabz.stack;
import com.bridgelabz.linkedlist.Node;

public class Operations {
    Node top = null;
    public void push(int data)
    {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }
    public void pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = top.next;
    }
    public int peek()
    {
        if (top != null)
            return top.data;
        else
            return -1;
    }
    public void print()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");
        }
        else {
            System.out.println("Stack elements are ");
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
