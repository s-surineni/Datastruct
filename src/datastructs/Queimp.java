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
public class Queimp {
    Linkdlist que=new Linkdlist();
    Scanner sc=new Scanner(System.in);
    String ip;
    
    public static void main(String[] args){
        Queimp qu=new Queimp();
        qu.giveChoice();
    }
    void giveChoice(){
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("enter i to insert");
            System.out.println("");
            System.out.println("enter d to delete");
            System.out.println("");
            System.out.println("enter e to exit");
            System.out.println("");
            ip=sc.nextLine();
            char chose=ip.charAt(0);
            switch(chose){
                case 'i':
                    insert();
                    break;
                case 'd':
                    delete();
                    break;
            }            
        } while (!ip.equals("e"));
    }
    
    void insert(){
        System.out.println("");
        System.out.println("");
        System.out.println("enter a value to insert");
        que.addToLL(Integer.parseInt(sc.nextLine()));
                        
    }
    
    void delete(){
        que=que.next;
        que.DisplayLL();
    }
}
