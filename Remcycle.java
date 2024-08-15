import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class Remcycle {
    Node head;

    public void addLast(int data){
        Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }

            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;

    }


    public void print(){
        Node curr=head;
        if(head==null){
            return;
        }

        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;

        }
        System.out.println("NULL");
    }

    public void hascycle(){
        if(head==null){
            return;
        }

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                //return true;
                removeCycle(slow,head);
                break;
            }
        }

        //return false;
    }

    public void removeCycle(Node meet,Node head){
        Node p1=head;
        Node p2=meet;

        while(p1.next!=p2.next){
            p1=p1.next;
            p2=p2.next;

        }

        p2.next=null;
    }

    public static void main(String args[]){
        Remcycle list=new Remcycle();
        Scanner sc=new Scanner(System.in);
         System.out.println("size:");
        int size=sc.nextInt();

        System.out.println("entering:");

       
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            list.addLast(data);
        }

        
        //list.addLast(size);
        list.head.next.next.next.next.next=list.head.next.next;

        list.hascycle();
        list.print();


        
    }


    

    
}
