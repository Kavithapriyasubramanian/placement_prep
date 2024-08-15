import java.util.Scanner;

class TwoStacks {
    int size;
    int top1, top2;
    int arr[];

    // Constructor
    TwoStacks(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    // Method to push an element x to stack1
    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    // Method to push an element x to stack2
    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    // Method to pop an element from the first stack
    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
            return 0; // unreachable code, added for compilation
        }
    }

    // Method to pop an element from the second stack
    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
            return 0; // unreachable code, added for compilation
        }
    }

    // Driver program to test the TwoStack class
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        TwoStacks ts = new TwoStacks(size);
        System.out.println("Where to print, in stack A or B? (Type 'A' or 'B')");
        char choice = sc.next().charAt(0);

        if (choice == 'A') {
            for (int i = 0; i < size; i++) {
                ts.push1(i);
            }
        } else if (choice == 'B') {
            for (int i = size - 1; i >= 0; i--) {
                ts.push2(i);
            }
        } else {
            System.out.println("Invalid choice");
            System.exit(1);
        }

        System.out.println("Popped element from stack1 is " + ts.pop1());

        ts.push2(sc.nextInt());

        System.out.println("Popped element from stack2 is " + ts.pop2());

        sc.close();
    }
}
