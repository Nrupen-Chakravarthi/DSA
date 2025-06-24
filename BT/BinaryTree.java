//package BT;
//
//import java.util.Scanner;
//
//public class BinaryTree {
//    private static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int data){
//            this.val = data;
//        }
//    }
//    private TreeNode root;
//
//    public void populate(Scanner scanner){
//        System.out.println("Enter Root node data: ");
//        int value = scanner.nextInt();
//        root = new TreeNode(value);
//        populate(scanner, root);
//    }
//    public void populate(Scanner scanner, TreeNode root){
//        System.out.println("Do you want to enter left of: "+ root.val);
//        boolean left = scanner.nextBoolean();
//        if(left){
//            System.out.println("Enter the data to the left of: "+ root.val);
//            int value = scanner.nextInt();
//            root.left = new TreeNode(value);
//            populate(scanner, root.left);
//        }
//        System.out.println("Do you want to enter right of: "+root.val);
//        boolean right = scanner.nextBoolean();
//        if(right){
//            System.out.println("Enter the data to the right of: "+ root.val);
//            int value = scanner.nextInt();
//            root.right = new TreeNode(value);
//            populate(scanner, root.right);
//        }
//    }
//    public void display(){
//        display(root, 0);
//    }
//    public void display(TreeNode root, int level){
//        if(root == null){
//            return;
//        }
//        display(root.right, level + 1);
//        if(level != 0){
//            for(int i = 0; i < level; i++){
//                System.out.print("\t");
//            }
//            System.out.println(root.val);
//        }
//        else {
//            System.out.println(root.val);
//
//        }
//
//        display(root.left, level+1);
//
//    }
//    public static void main(String[] args) {
//        BinaryTree bt = new BinaryTree();
//        Scanner scanner = new Scanner(System.in);
//        bt.populate(scanner);
//        bt.display();
//    }
//    public static void builder(){
//        StringBuilder name = new StringBuilder("Nrupen");
//        name.
//    }
//}
