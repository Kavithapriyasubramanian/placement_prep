import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

 public class Sort012 {
    Node head;

    public void addLast(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }


   public void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("Null");
    }


    public void sort(){
        int count[]={0,0,0};

        Node curr=head;


        while(curr!=null){
            count[curr.data]++;
            curr=curr.next;
        
        }

        int i=0;
        curr=head;


        while(curr!=null){
            if(count[i]==0){
                i++;
            }
                else{
                    curr.data=i;
                    --count[i];
                    curr=curr.next;
                }
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sort012 list=new Sort012();
        System.out.println("size:");

        int size=sc.nextInt();
        System.out.println("entering:");
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            list.addLast(data);
        }

        System.out.println("Before sorting:");
        list.print();

        System.out.println("after sorting:");
        list.sort();
        list.print();
    }

}
    

