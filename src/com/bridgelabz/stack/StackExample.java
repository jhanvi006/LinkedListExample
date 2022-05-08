package com.bridgelabz.stack;
import java.util.Scanner;

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create stack using linked list.");
        System.out.print("-----------------------------------------");
        int choice;
        do {
            System.out.println("\nSelect option. \n1. Push \n2. Pop " +
                    "\n3. Peek \n0. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    break;
                case 1:
                    Stack.addDataToStack();
                    break;
                case 2:
                    Stack.removeDataFromStack();
                    break;
                case 3:
                    Stack.displayTopElement();
                    break;
                default:
                    System.out.println("Invalid number!");
            }
        }while (choice != 0);
    }
}
