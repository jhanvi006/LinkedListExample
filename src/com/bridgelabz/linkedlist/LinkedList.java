package com.bridgelabz.linkedlist;

public class LinkedList {
    static Operations op = new Operations();
    public static void addDataAtStart(){
        op.push(70);
        op.push(30);
        op.push(56);
        op.print();
    }
    public static void addDataAtEnd(){
        op.append(70);
        op.append(30);
        op.append(56);
        op.print();
    }
    public static void addDataInMiddle(){
        op.push(70);
        op.push(30);
        op.insertInMiddle(56);
        op.print();
    }
    public static void removeFirstElement(){
        op.removeFirstNode();
        op.print();
    }
    public static void removeLastElement(){
        op.removeLastNode();
        op.print();
    }
    public static void searchElement(int element){
        int index = op.searchElement(element);
        if (index == -1)
            System.out.println("Element not found.");
        else
            System.out.println(element+" is at index no. "+index);
    }
}
