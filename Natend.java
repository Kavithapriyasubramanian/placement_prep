import java.util.Scanner;

class LinkedList {
    Node head; // head of the list

    /* Linked List node */
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Function to get the Nth node from the last of a
    linked list */
    void printNthFromLast(int N) {
        if (N <= 0) {
            System.out.println("Invalid value of N");
            return;
        }

        Node slow = head;
        Node fast = head;

        // Move fast pointer N nodes ahead
        for (int i = 0; i < N; i++) {
            if (fast == null) {
                System.out.println("N is greater than the length of the linked list");
                return;
            }
            fast = fast.next;
        }

        // Move both pointers until fast pointer reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 'slow' is now pointing to the Nth node from the end
        System.out.println(slow.data);
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    // Driver's code
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // Taking user input for the number of elements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        // Taking user input for the elements
        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            llist.push(element);
        }

        // Taking user input for N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Function call
        llist.printNthFromLast(N);

        // Close the Scanner
        scanner.close();
    }
}
