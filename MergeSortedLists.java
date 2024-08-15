/*import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Lis{
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
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.print("null");
    }

    public static Node merge(Node p1,Node p2){
        //resNode as dummy node
        Node resNode=new Node(-1);
           Node head=resNode;
       

        while(p1!=null && p2!=null){
            if(p1.data<=p2.data){
                resNode.next=p1;
                p1=p1.next;
            }
            else{
                resNode.next=p2;
                p2=p2.next;
            }

            resNode=resNode.next;
        }

        if(p1==null){
            resNode.next=p2;
        }
        else if(p2==null){
            resNode.next=p1;
        }
        return head.next;
    }
}

class MergeSortedLists{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Lis l1=new Lis();
        Lis l2=new Lis();
        int n1=sc.nextInt();
        for(int i=0;i<n1;i++){
            l1.addLast(sc.nextInt());
        }
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            l2.addLast(sc.nextInt());
        }
        Lis mergedList = new Lis();
        
        Node mergedListHead = Lis.merge(l1.head, l2.head);
        //Lis mergedList = new Lis();
        mergedList.head = mergedListHead;

        System.out.println("Merged List:");
        mergedList.print();

    }
}*/

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class List{
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
            System.out.println();
        }
    }

    public void print(){
        Node curr=head;
        if(head==null){
            return;
        }
        else{
            while(curr!=null){
                System.out.println(curr.data+"->");
                curr=curr.next;
            }
            System.out.println("NULL");
        }
    }
}