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
public class Stackim {
    Scanner sc=new Scanner(System.in);
    Linkdlist stack=new Linkdlist();
    char ip;
    public static void main(String[] args){
        Stackim i1=new Stackim();
        i1.giveChoice();
    }
    void giveChoice(){
        do{
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("enter p to push");
            System.out.println("");
            System.out.println("");
            System.out.println("enter q to pop");
            System.out.println("");
            System.out.println("");
            System.out.println("enter e exit");
            ip=sc.nextLine().charAt(0);
            switch(ip){
                case 'p':
                    push();
                    break;
                case 'q':
                    pop();
                    break;
            }
        }while(ip!='e');
    }
    public void push(){
        System.out.println("please enter a value to insert");
        int ip=Integer.parseInt(sc.nextLine());
        stack.addToLL(ip);
        
    }
    
    public void pop(){
        if(stack.head==null)
            System.out.println("the stack is empty");
        else
            stack.delAtBegin();
    }
}
