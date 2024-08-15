import java.util.*;
import java.util.LinkedList;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    public void Levelorder(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);

            if (current.right != null)
                queue.add(current.right);
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = new TreeNode(sc.nextInt());
        root.left = new TreeNode(sc.nextInt());
        root.right = new TreeNode(sc.nextInt());
        root.left.left = new TreeNode(sc.nextInt());
        root.left.right = new TreeNode(sc.nextInt());
        root.right.left = new TreeNode(sc.nextInt());
        root.right.right = new TreeNode(sc.nextInt());

        Tree tree = new Tree();
        tree.Levelorder(root);
    }
}
