import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}



public class DeleteLL{
    Node head;



    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
            
        }
        currNode.next=newNode;
    }



    public void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("NULL");

    }


    public void Del(){
        /*Node newNode=new Node(data);
        Node curr=newNode.next;
        newNode.data=curr.data;
        newNode.next=curr.next;
        curr=null;*/

        if(head!=null){
            head=head.next;
        }

    }


    


    /*public static void main(String[] args) {
        DeleteLL list=new DeleteLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println("Before del:");

        list.print();
        
        list.Del();
        System.out.println("after deleting");

        list.print();
        
    }*/


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DeleteLL list=new DeleteLL();
        System.out.println("size:");
        int size=sc.nextInt();

        System.out.println("entering:");

        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            list.addLast(data);
        }

        System.out.println("the before linkedlist");
        list.print();
        System.out.println("after del:");
        list.Del();
        list.print();

    }

    
}