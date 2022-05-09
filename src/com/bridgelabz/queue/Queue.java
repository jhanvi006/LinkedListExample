package com.bridgelabz.queue;
import com.bridgelabz.linkedlist.Operations;

public class Queue {
    static Operations op = new Operations();
    public static void addDataToQueue(){
        op.append(56);
        op.append(30);
        op.append(70);
        System.out.print("Queue elements are ");
        op.print();
    }
}
