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
        ll.insert();
    }
    
    void insert(){
        int lc;
        Scanner s1=new Scanner(System.in);
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
    }
    
    void tInput(){
        Scanner s1=new Scanner(System.in);
        System.out.println("start giving input");
        int[] Ar=new int[3];
        for(int i=0;i<3;i++){
            Ar[i]=s1.nextInt();
            
        }
        Display(Ar);
    }
    
    void Display(int[] Arr){
        System.out.println("Start of Display");
        for(int trk=0;trk<Arr.length;trk++){
         
         System.out.println(Arr[trk]+ " ");
        }
        System.out.println("End of Display");
    }
    
}
