package com.bridgelabz.linkedlist;

public class Operations {
    Node head;
    Node tail;
    public void push(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }
    public void append(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertInMiddle(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            Node middle = head;
            /*  Find the middle node  */
            while (temp.next != null && temp.next.next != null)
            {
                temp = temp.next.next;
                middle = middle.next;
            }
            /*  add node  */
            newNode.next = middle.next;
            middle.next = newNode;
        }
    }
    public void removeFirstNode(){
        if (head != null){
            Node temp = head;
            head = head.next;
        }
    }
    public void removeLastNode(){
        if (head != null) {
            /*  Check if linked list contains one node
            *   if it contains 1 node remove it
            *   else traverse till last second node.
            */
            if (head != tail){
                Node current = head;
                while (current.next != tail){
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }
    public int searchElement(int element){
        if (head == null)
            return -1;
        else {
            int index = 0;
            Node temp = head;
            while (temp != null){
                if (temp.data == element)
                    return index;
                index++;
                temp = temp.next;
            }
            /*  Element not found  */
            return -1;
        }
    }
    public void print(){
        if (head == null)
            System.out.println("Linked list is empty.");
        else{
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
}
