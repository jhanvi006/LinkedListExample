package com.bridgelabz.stack;

public class Stack {
    static Operations op = new Operations();
    public static void addDataToStack(){
        op.push(70);
        op.push(30);
        op.push(56);
        op.print();
    }
    public static void removeDataFromStack(){
        op.pop();
        op.print();
    }
    public static void displayTopElement(){
        int topElement = op.peek();
        if (topElement == -1)
            System.out.println("Stack is empty.");
        else
            System.out.println(topElement);
    }
}
