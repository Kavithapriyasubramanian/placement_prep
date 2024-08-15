import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Zigzagll {
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
        if(head==null){
            return;
        }

        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;

        }
        System.out.println("NULL");
    }

    public void zigzag(){
        if(head==null || head.next==null){
            return;
        }

        Node node=head;
        boolean flag=true;

        while(node.next!=null){
            if(flag){
                if(node.data>node.next.data){
                    int t=node.data;
                    node.data=node.next.data;
                    node.next.data=t;
                }

                //flag=!flag;

            }
            else{
                if(node.data<node.next.data){
                    int t=node.data;
                    node.data=node.next.data;
                    node.next.data=t;
                }
                //flag=!flag;
            }
            flag=!flag;
            node=node.next;
        }
        
    }


    Node getnewNode(int k){
        Node a=new Node(k);
        a.next=null;
        //a.data=k;
        return a;
    }

    Node insert(int k,Node node){
       // Node node=head;
        if(node==null){
            return getnewNode(k);
        }
        else{
            node.next=insert(k,node.next);
                return node;
            }
            
    }

    public void insert(int k){
        head=insert(k,head);
    }
        
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Zigzagll list=new Zigzagll();
        System.out.println("size:");
        int size=sc.nextInt();

        System.out.println("entering:");
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            list.addLast(data);
        }
        System.out.println("ll:");
        list.print();


        System.out.println("ZIGZAG list");

        list.zigzag();
        list.print();

    }
    
}
