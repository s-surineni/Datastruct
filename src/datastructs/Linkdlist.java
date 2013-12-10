/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructs;

import com.sun.jndi.toolkit.ctx.HeadTail;
import java.util.Scanner;

/**
 *
 * @author mc13mt49
 */
public class Linkdlist {
    int data;
    
    Linkdlist head,tail,next,temp;
    Scanner s1=new Scanner(System.in);
    public Linkdlist(){
        next=null;
    }
    
    void init(){
        head=tail=next=null;
    }
    
    
    public Linkdlist(int data,Linkdlist link){
        this.data=data;
        this.next=link;
    }
    
    public static void main(String[] args){
        Linkdlist ll=new Linkdlist();
        ll.init();
        ll.giveChoice();
    }
    
    void insert(){
        int lc;
        
        int data;
        System.out.println("enter a value to insert ");
        String ip;
        
        while(true){
            System.out.println("enter e to exit");
            ip=s1.nextLine();
            
            if(ip.equals("e"))
                break;
            
            data=Integer.parseInt(ip);
            System.out.println("value in data "+data);
            addToLL(data);
            System.out.println("enter a value to insert ");
        }
    }
    
    void insertAt(int val,int pos){
        int count=0;
        temp=head;
        for( ;temp.next!=null && count<pos;count++){
            
        }
        
    }
    
    void addToLL(int data){
        if(head==null){
            head=new Linkdlist();
            head.data=data;
            head.next=null;
            tail=head;
        }
        else{
            tail.next=new Linkdlist();
            tail=tail.next;
            tail.data=data;
            tail.next=null;
        }
        DisplayLL();
    }
    
    void DisplayLL(){
        System.out.println("Values in the list");
        temp=head;
        while(temp!=null){
            System.out.println(" "+temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println();
    }
    
    void giveChoice(){
        
        String is="start";
        while(!is.equals("exit")){
            System.out.println("Choose the available options");
            System.out.println();
            System.out.println("Press");
            System.out.println();
            System.out.println("d display the list");
            System.out.println();
            System.out.println("i to inset an element");
            System.out.println();
            System.out.println("press exit to exit");
            is=s1.nextLine();
            char choice=is.charAt(0);
            switch(choice){
            case 'd':
                DisplayLL();
                break;
            case 'i':
                insert();
                break;
                
                
        }
        
        }
        
    }
    
    
    
}
