/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructs;

import java.util.Scanner;

/**
 *
 * @author mc13mt49
 */
public class LlForStack {
    int data;
    LlForStack head, tail, next, temp;
    Scanner s1 = new Scanner(System.in);
    String ip;

    public LlForStack() {
        next = null;
    }

    public LlForStack(int data, LlForStack link) {
        this.data = data;
        this.next = link;
    }

    public static void main(String[] args) {
        LlForStack ll = new LlForStack();
        ll.init();
        ll.giveChoice();
    }

    void init() {
        head = tail = next = null;
    }

    void giveChoice() {
        System.out.println();
        System.out.println();
        while (true) {
            System.out.println("Choose the available options");
            System.out.println();
            System.out.println("Press::");
            System.out.println();
            System.out.println("d display the list");
            System.out.println();
            System.out.println("i to inset an element");
            System.out.println();
            System.out.println("j to inset an element at a position");
            System.out.println();
            System.out.println("k to delete an element");
            System.out.println();
            System.out.println("press exit to exit");

            ip = s1.nextLine();
            if (ip.equals("exit")) {
                break;
            }

            char choice = ip.charAt(0);

            switch (choice) {
                case 'd':
                    DisplayLL();
                    break;
                case 'i':
                    insert();
                    break;
                case 'j':
                    insertAt();
                    break;
                case 'k':
                    delete();
                    break;
            }
        }
    }

    void insert() {
        System.out.println();
        System.out.println();
        
        while (true) {
            System.out.println("enter a value to insert ");
            System.out.println("enter exit to exit");
            ip = s1.nextLine();
            if (ip.equals("exit")) {
                break;
            }

            data = Integer.parseInt(ip);
            addToLL(data);

        }
    }
    
    void insertPush(int val){
        
    }

    void insertAt() {
        while (true) {
            System.out.println("Enter b to insert at beginning");
            System.out.println("Enter m to insert in the middle");
            System.out.println("Enter e to insert at the end");
            System.out.println("Enter exit to exit");
            ip = s1.nextLine();
            if (ip.equals("exit")) {
                break;
            }
            switch (ip.charAt(0)) {
                case 'b':
                    atBegin();
                    break;
                case 'm':
                    atMiddle();
                    break;
                case 'e':
                    atEnd();
            }
        }

        DisplayLL();

    }

    void atBegin() {
        System.out.println("enter value to insert");
        
        int val = Integer.parseInt(s1.nextLine());
        temp = head;
        if (head == null) {
            head = new LlForStack(val, null);
            tail = head;
        } else {
            int tempd;
            tempd = temp.data;
            temp.data = val;
            for (; temp.next != null;) {
                temp = temp.next;
                temp.data = temp.data + tempd;
                tempd = temp.data - tempd;
                temp.data = temp.data - tempd;

            }

            temp.next = new LlForStack(tempd,null);
            temp = temp.next;
            tail = temp;


        }
        DisplayLL();
    }

    void atMiddle() {
        System.out.println("insert the value to enter");
        int val = Integer.parseInt(s1.nextLine());
        System.out.println("instert the position");

        int pos = Integer.parseInt(s1.nextLine());
        temp = head;
        for (int count = 1; count < pos; count++) {
            temp = temp.next;
        }
        int tempd = temp.data;
        temp.data = val;
        for (; temp.next != null;) {
            temp = temp.next;
            temp.data = temp.data + tempd;
            tempd = temp.data - tempd;
            temp.data = temp.data - tempd;

        }

        temp.next = new LlForStack();
        temp = temp.next;
        temp.data = tempd;
        tail = temp;
        DisplayLL();
    }

    void atEnd() {
        System.out.println("insert the value to enter");
        int val = Integer.parseInt(s1.nextLine());
        temp = tail;
        temp.next = new LlForStack(val, null);
        tail = temp;
        DisplayLL();
    }

    void addToLL(int data) {
        if (head == null) {
            head = new LlForStack(data, null);
            tail = head;
        } else {
            tail.next = new LlForStack();
            tail = tail.next;
            tail.data = data;
            tail.next = null;
        }
        DisplayLL();
    }

    void DisplayLL() {
        System.out.println();
        System.out.println();
        if(head==null){
            System.out.println("The list is empty");
        }
        else{
            
            System.out.println("Values in the list");
            temp = head;
            while (temp != null) {
                System.out.println(" " + temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
        System.out.println();
    }

    void delete() {
        while (true) {
            System.out.println("Enter i to delete with index");
            System.out.println("Enter v to delete with value");
            System.out.println("Enter exit to exit");
            ip = s1.nextLine();
            if (ip.equals("exit")) {
                break;
            }
            switch (ip.charAt(0)) {
                case 'i':
                    deleteWidInd();
                    break;
                case 'v':
                    delWidVal();
                    break;

            }
        }
    }

    void deleteWidInd() {
        System.out.println("enter the index of node to delte");
        int ind = Integer.parseInt(s1.nextLine());
        temp = head;
        if (ind == 1) {
            head = head.next;
        } else {
            for (int tr = 2; tr < ind; tr++) {
                temp = temp.next;
            }
            LlForStack temp1 = temp.next;
            temp.next = temp1.next;

        }
        DisplayLL();
    }

    void delWidVal() {
        System.out.println("enter the value to delete");
        int val = Integer.parseInt(s1.nextLine());
        temp = head;
        if (head.data == val) {
            head = head.next;
        } else {
            for (; temp.next.data != val;) {
                temp = temp.next;
            }
            LlForStack temp1 = temp.next;
            temp.next = temp1.next;

        }
        DisplayLL();

    }
}
