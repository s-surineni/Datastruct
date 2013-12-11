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
    String ip;
    public Linkdlist(){
        next=null;
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
    
    void init(){
        head=tail=next=null;
    }
    
    void giveChoice(){
        System.out.println();
        System.out.println();
        String is;
        while(true){
            System.out.println("Choose the available options");
            System.out.println();
            System.out.println("Press");
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
            
            is=s1.nextLine();
            if(is.equals("exit"))
                break;
            
            char choice=is.charAt(0);
            
            switch(choice){
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
        
        
    void insert(){
        System.out.println();
        System.out.println();
        
        String ip;
        
        while(true){
            System.out.println("enter a value to insert ");
            System.out.println("enter e to exit");
            ip=s1.nextLine();
            
            if(ip.equals("e"))
                break;
            
            data=Integer.parseInt(ip);
            //System.out.println("value in data "+data);
            addToLL(data);
            
        }
    }
    
    void insertAt(){
        while(true){
            System.out.println("Enter b to insert at beginning");
            System.out.println("Enter m to insert in the middle");
            System.out.println("Enter e to insert at the end");
            System.out.println("Enter exit to exit");
            ip=s1.nextLine();
            if(ip.equals("exit"))
                break;
            switch (ip.charAt(0))
                    {
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
    
    void atBegin(){
        System.out.println("enter value to insert");
        ip=s1.nextLine();
        int val=Integer.parseInt(ip);
        temp=head;
        if(head==null){
            head=new Linkdlist(val, null);
            tail=head;
        }
        else{
            int tempd;
            tempd=temp.data;
            temp.data=val;
            for( ; temp.next!=null; ){
                temp=temp.next;
                temp.data=temp.data+tempd;
                tempd=temp.data-tempd;
                temp.data=temp.data-tempd;
            
                }
        
            temp.next=new Linkdlist();
            temp=temp.next;
            temp.data=tempd;
            tail=temp;
            
            
        }
        DisplayLL();
    }
    
    void atMiddle(){
        System.out.println("insert the value to enter");
        int val=Integer.parseInt(s1.nextLine());
        System.out.println("instert the position");
        
        int pos=Integer.parseInt(s1.nextLine());
        
        
        temp=head;        
            for(int count=1;count<pos ;count++){
            
                
                temp=temp.next;
            }
            int tempd=temp.data;
            temp.data=val;
            for( ; temp.next!=null; ){
                temp=temp.next;
                temp.data=temp.data+tempd;
                tempd=temp.data-tempd;
                temp.data=temp.data-tempd;
            
                }
        
            temp.next=new Linkdlist();
            temp=temp.next;
            temp.data=tempd;
            tail=temp;
                 DisplayLL();
    }
    
    void atEnd(){
        System.out.println("insert the value to enter");
        int val=Integer.parseInt(s1.nextLine());
        temp=tail;
        temp.next=new Linkdlist(val, null);
        tail=temp;
        DisplayLL();
    }
    void addToLL(int data){
        if(head==null){
            head=new Linkdlist(data,null);
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
        System.out.println();
        System.out.println();
        System.out.println("Values in the list");
        temp=head;
        while(temp!=null){
            System.out.println(" "+temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println();
    }
    
    void delete(){
        System.out.println("enter the index of node to delte");
        int ind=Integer.parseInt(s1.nextLine());
        temp=head;
        if(ind==1){
            head=head.next;
        }
        else{
        for(int tr=2 ;tr<ind;tr++){
            temp=temp.next;
        }
        Linkdlist temp1=temp.next;
        temp.next=temp1.next;
        }
        DisplayLL();
    }
    
    
    
    
}
