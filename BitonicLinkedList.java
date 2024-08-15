import java.util.Scanner;

class Node {
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

public class BitonicLinkedList {
    Node head;

    // Function to insert a node at the end of the linked list
    private void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Function to print the linked list
    private void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Function to merge two sorted linked lists
    private Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        if (left.data <= right.data) {
            left.next = merge(left.next, right);
            left.next.prev = left;
            left.prev = null;
            return left;
        } else {
            right.next = merge(left, right.next);
            right.next.prev = right;
            right.prev = null;
            return right;
        }
    }

    // Function to perform the bottom-up merge sort on the linked list
    private Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node middle = getMiddle(node);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = mergeSort(node);
        Node right = mergeSort(nextOfMiddle);

        return merge(left, right);
    }

    // Function to find the middle of the linked list
    private Node getMiddle(Node node) {
        if (node == null) {
            return node;
        }

        Node slow = node, fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Function to sort the bitonic linked list
    private Node sortBitonicList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node mid = getMiddle(node);
        Node nextOfMid = mid.next;

        mid.next = null;

        Node left = sortBitonicList(node);
        Node right = sortBitonicList(nextOfMid);

        return merge(left, right);
    }

    public static void main(String[] args) {
        BitonicLinkedList list = new BitonicLinkedList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the bitonic linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the bitonic linked list:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insert(data);
        }

        list.head = list.sortBitonicList(list.head);

        System.out.println("Sorted Bitonic Linked List:");
        list.printList(list.head);
    }
}
