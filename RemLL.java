
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    
    
public class RemLL {
        Node head;


        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
    
            Node curr=head;
            while (curr.next!=null) {
                curr=curr.next;
                
            }
            curr.next=newNode;
        }
    

        public void rem(){
          if(head==null){
            return;
          }

          Node curr=head;
          while(curr!=null){
            Node p2=curr;

            while(p2.next!=null){
                if(p2.next.data==curr.data){
                    p2.next=p2.next.next;
                }
                else{
                    p2=p2.next;
                }
            }
            curr=curr.next;
          }


        }

        public void Print(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+"->");
                curr=curr.next;
            }
            System.out.println("NULL");
        }


        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        RemLL list=new RemLL();
        System.out.println("size");
        int size=sc.nextInt();

        System.out.println("entering:");

        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            list.addLast(data);
        }

        System.out.println("Before removing");
        list.Print();

       
        list.rem();

        System.out.println("after removing :");
        
        list.Print();
    }


    
}
