
import java.util.*;
class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class Tree {
    Node root;
    int sum=0;

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }
    
    public static Node buildTree(String str[]) {
        if (str[0].equals("N")) {
            return null;
        }
    
        Tree t = new Tree();
        t.root = new Node(Integer.parseInt(str[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(t.root);
        int i = 1;
        while (!q.isEmpty() && i < str.length) {
            Node cur = q.poll();
            if (!str[i].equals("N")) {
                cur.left = new Node(Integer.parseInt(str[i]));
                q.add(cur.left);
            }
            i++;
            if (i < str.length && !str[i].equals("N")) {
                cur.right = new Node(Integer.parseInt(str[i]));
                q.add(cur.right);
            }
            i++;
        }
        return t.root;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = diameter(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }
}


public class Diameter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree bt = new Tree();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("-1")) {
            int value = Integer.parseInt(inputLine);
            bt.root = Tree.insert(bt.root, value);
            inputLine = scanner.nextLine();
        }
        scanner.close();
        int diameter = Tree.diameter(bt.root);
        System.out.println("Diameter of the given binary tree is " + diameter);
    }
}