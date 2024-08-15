import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Multiply {
    Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public long multi() {
        long n1 = 0;
        long n2 = 0;

        Node curr = head;

        while (curr != null) {
            n1 = (n1 * 10) + curr.data;
            curr = curr.next;
        }

        System.out.println("Enter the size of the second number:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Entering the second number:");
        Multiply listB = new Multiply();
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            listB.addLast(data);
        }

        System.out.println("First List:");
        print();
        System.out.println("Second List:");
        listB.print();

        curr = listB.head;
        while (curr != null) {
            n2 = (n2 * 10) + curr.data;
            curr = curr.next;
        }

        return n1 * n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiply list = new Multiply();

        System.out.println("Enter the size of the first number:");
        int size = sc.nextInt();
        System.out.println("Entering the first number:");
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            list.addLast(data);
        }

        System.out.println("List:");
        list.print();

        //list.multi();
        //list.print();

       long result=list.multi();
       System.out.println("Multiplication result: " + result);
    }
}
