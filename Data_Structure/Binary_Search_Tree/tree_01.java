package Binary_Search_Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class tree_01 {
    TreeNode1 root;

    public class TreeNode1 {
        TreeNode1 left;
        TreeNode1 right;
        int data;
        public TreeNode1(int data) {
            this.data = data;
        }
    }
    public void createBinaryTree() {
        TreeNode1 TN1 = new TreeNode1(5);
        TreeNode1 TN2 = new TreeNode1(2);
        TreeNode1 TN3 = new TreeNode1(12);
        TreeNode1 TN4 = new TreeNode1(1);
        TreeNode1 TN5 = new TreeNode1(3);
        TreeNode1 TN6 = new TreeNode1(9);
        TreeNode1 TN7 = new TreeNode1(21);
        TreeNode1 TN8 = new TreeNode1(19);
        TreeNode1 TN9 = new TreeNode1(25);

        root = TN1;
        TN1.left = TN2;
        TN1.right = TN3;

        TN2.left = TN4;
        TN2.right = TN5;

        TN3.left=TN6;
        TN3.right=TN7;

        TN7.left=TN8;
        TN7.right=TN9;
    }

    public void InOrder(TreeNode1 root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
    public static void main(String[] args) {
        tree_01 t1 = new tree_01();
        t1.createBinaryTree();
        System.out.println("using recursion IN-order");
        t1.InOrder(t1.root);
    }
}
