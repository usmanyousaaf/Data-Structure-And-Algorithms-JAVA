//package Binary_Search_Tree;
//
//import java.util.Scanner;
//
//public class search_in_binaryTree {
//
//    TreeNode1 root;
//
//    public class TreeNode1 {
//        TreeNode1 left;
//        TreeNode1 right;
//        int data;
//
//        public TreeNode1(int data) {
//            this.data = data;
//        }
//
//    }
//
//    public void makeBinaryTree() {
//        TreeNode1 first = new TreeNode1(5);
//        TreeNode1 second = new TreeNode1(2);
//        TreeNode1 third = new TreeNode1(12);
//        TreeNode1 fourth = new TreeNode1(1);
//        TreeNode1 fifth = new TreeNode1(3);
//        TreeNode1 sixth = new TreeNode1(9);
//        TreeNode1 seventh = new TreeNode1(21);
//        TreeNode1 eight = new TreeNode1(19);
//        TreeNode1 nine = new TreeNode1(25);
//
//        root = first;
//        first.left = second;
//        first.right = third;
//
//        second.left = fourth;
//        second.right = fifth;
//        third.left = sixth;
//        third.right = seventh;
//        seventh.left = eight;
//        second.right = nine;
//        fourth.left = null;
//        fourth.right = null;
//        fifth.left = null;
//        fifth.right = null;
//        sixth.left = null;
//        sixth.right = null;
//        findFullNode(root);
//
//        public static void findFullNode(Node root)
//        {
//            if (root != null)
//            {
//                findFullNode(root.left);
//                if (root.left != null && root.right != null)
//                    System.out.print(root.data+" ");
//                findFullNode(root.right);
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        search_in_binaryTree s1 = new search_in_binaryTree();
//        s1.makeBinaryTree();
//    }
//}
