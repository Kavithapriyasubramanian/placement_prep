/*
//segreate even and odd data
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Soe {
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
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }



    public void Sep(){
        Node node=head;
        if(node==null || node.next==null){
            return;
        }

        Node evenstart,evenEnd,oddstart,oddend;

        evenstart=evenEnd=oddstart=oddend=null;

        while(node!=null){
            //Node nextNode = node.next;
            if(node.data%2==0){
            if(evenstart==null){
                evenstart=node;
                evenEnd=evenstart;
            }
            else{
                evenEnd.next=node;
                evenEnd=evenEnd.next;
            }
        }else{
            if(oddstart==null){
                oddstart=node;
                oddend=oddstart;

            }
            else{
                oddend.next=node;
                oddend=oddend.next;
            }
        }
        node=node.next;
    }

   if(evenstart==null){
    head=oddstart;
   }
   else{
    evenEnd.next=oddstart;
    if(oddstart!=null){
        oddend.next=null;
    }
    head=evenstart;
   }
    
}


public static void main(String[] args) {
    Soe list=new Soe();
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
    System.out.println("soe:");
    list.Sep();
    list.print();

}
}
*/

//seg odd and even index
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return oddHead;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        ListNode head = createLinkedList(arr);
        ListNode newHead = oddEvenList(head);
        printList(newHead);
    }
}
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.split(" ");
        int n=words.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(words[i]);
        }
        List<Integer>evenlist=new ArrayList<>();
        List<Integer>oddlist=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(arr[i]%2!=0){
                oddlist.add(arr[i]);
            }
            else{
                evenlist.add(arr[i]);
            }
        }
        for(int odd:oddlist){
            System.out.print(odd+" ");
        }
        for(int even :evenlist){
            System.out.print(even+" ");
        }
    }
}