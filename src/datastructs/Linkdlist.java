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
            System.out.println("j to inset an element at a position");
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
                
            case 'j':
                insertAt();
                break;
                
                
        }
        
        }
        
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
    
    void insertAt(){
        System.out.println("insert the value to enter");
        int val=Integer.parseInt(s1.nextLine());
        System.out.println("instert the position");
        
        int pos=Integer.parseInt(s1.nextLine());
        
        int tempd;
        temp=head;
        if(temp==null){
            head=new Linkdlist(val, null);
        }
        else{
            for(int count=1;count<pos ;count++){
            
                if(count==(pos-1) && (temp.next == null))
                    break;
                temp=temp.next;
            }
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
            }
            
            }
        /*if(pos==1){
            head=new Linkdlist(val, null);
        }
        else{
            temp=head;
            for( ;temp.next!=null && count<pos;count++){
                temp=temp.next;
                }
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
            }*/
        DisplayLL();
        
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
    
    
    
    
    
}
