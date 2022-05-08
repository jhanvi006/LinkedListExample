package com.bridgelabz.stack;
import com.bridgelabz.linkedlist.Operations;

public class Stack {
    static Operations op = new Operations();
    public static void addDataToStack(){
        op.push(70);
        op.push(30);
        op.push(56);
        System.out.print("Stack elements are ");
        op.print();
    }
}
