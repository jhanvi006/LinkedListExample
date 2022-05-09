package com.bridgelabz.queue;

import java.util.Scanner;

public class Queue {
    static Operations op = new Operations();
    static Scanner sc = new Scanner(System.in);
    public static void addDataToQueue(){
        System.out.println("Enter a number to add in queue: ");
        op.enqueue(sc.nextInt());
        op.print();
    }
    public static void removeDataFromQueue(){
        op.dequeue();
        op.print();
    }
}
