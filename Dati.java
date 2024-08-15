import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}



public class Dati{
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


    public void Del(int data){
        Node curr=head;
        Node prev=null;


        while(curr!=null && curr.data!=data){
            prev=curr;
            curr=curr.next;
        }


        //if node to be del found,remove it
        if(curr!=null){
            if(prev!=null){
                prev.next=curr.next;
            }
            else{
                head=curr.next;
            }
            curr=null;
        }
        else{
            System.out.println("node with data"+data+"not found");
        }
        
        
    }




    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Dati list=new Dati();
        System.out.println("size");
        int size=sc.nextInt();

        System.out.println("entering:");

        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            list.addLast(data);
        }

        System.out.println("Before ll");
        list.print();

        System.out.println("eneter data that is to be deleted");
        int dataToDelete=sc.nextInt();
        list.Del(dataToDelete);

        System.out.println("del after");
        
        list.print();
    }
}