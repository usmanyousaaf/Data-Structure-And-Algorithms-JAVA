package Binary_Search_Tree;

import java.util.Scanner;

public class find_max_in_binaryTree {
    TreeNode2 root;

    public class TreeNode2 {
        TreeNode2 left;
        TreeNode2 right;
        int data;

        public TreeNode2(int data) {

            this.data = data;
        }

    }

    public void makeBinaryTree() {
        TreeNode2 first = new TreeNode2(6);
        TreeNode2 second = new TreeNode2(4);
        TreeNode2 third = new TreeNode2(8);
        TreeNode2 fourth = new TreeNode2(2);
        TreeNode2 fifth = new TreeNode2(5);
        TreeNode2 sixth = new TreeNode2(7);
        TreeNode2 seventh = new TreeNode2(9);
        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;

        fourth.left = null;
        fourth.right = null;
        fifth.left = null;
        fifth.right = null;
        sixth.left = null;
        sixth.right = null;
        seventh.left = null;
        seventh.right = null;

    }


    public  int findMax(TreeNode2 root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);

        if (left > result) {
            result = left;
        }
        if (right > result) {
            result = right;
        }
        return result;
    }


    public static void main(String[] args) {
        find_max_in_binaryTree find1 = new find_max_in_binaryTree();

        System.out.println(find1.findMax(find1.root));

    }
}
