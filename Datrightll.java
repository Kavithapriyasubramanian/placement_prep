import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;

    }
}

public class Datrightll {
   Node head;

   public void addLast(int data){
    Node newNode=new Node(data);

    if(head==null){
        head=newNode;

    }
    else{
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
   }


   public void print(){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" ->");
        curr=curr.next;
    }
    System.out.println("NUll");
   }


   public void Delete(){
    Node curr=head;
    Node maxnode=null;
    Node nextNode;

    while(curr!=null && curr.next!=null){
        nextNode=curr.next;
        if(curr.data<nextNode.data){
            if(maxnode==null){
                head=nextNode;
            }
            else{
                maxnode.next=nextNode;
            }
            curr=nextNode;
            
    }else{
        maxnode=curr;
        curr=nextNode;
    }
    }
   }

   public static void main(String[] args) {
    Datrightll list=new Datrightll();
    Scanner sc=new Scanner(System.in);
    System.out.println("size:");
    int size=sc.nextInt();

    System.out.println("entering:");
    for(int i=0;i<size;i++){
        int data=sc.nextInt();
        list.addLast(data);
    }
    System.out.println("ll:");
    list.print();

    System.out.println("after dele:");

    list.Delete();
    list.print();

   }
    
}
