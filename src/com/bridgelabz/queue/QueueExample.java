package com.bridgelabz.queue;

import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create stack using linked list.");
        System.out.println("-----------------------------------------");
        int choice;
        do {
            System.out.println("\nSelect option. \n1. Add data to queue \n2. Delete data from queue " +
                    "\n0. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    break;
                case 1:
                    Queue.addDataToQueue();
                    break;
                case 2:
                    Queue.removeDataFromQueue();
                    break;
                default:
                    System.out.println("Invalid number!");
            }
        }while (choice != 0);
    }
}
