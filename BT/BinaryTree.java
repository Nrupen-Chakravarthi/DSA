package BT;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter Root node data: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    public void populate(Scanner scanner, Node root){
        System.out.println("Do you want to enter left of: "+ root.data);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the data to the left of: "+ root.data);
            int value = scanner.nextInt();
            root.left = new Node(value);
            populate(scanner, root.left);
        }
        System.out.println("Do you want to enter right of: "+root.data);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the data to the right of: "+ root.data);
            int value = scanner.nextInt();
            root.right = new Node(value);
            populate(scanner, root.right);
        }
    }
    public void display(){
        display(root, 0);
    }
    public void display(Node root, int level){
        if(root == null){
            return;
        }
        display(root.right, level + 1);
        if(level != 0){
            for(int i = 0; i < level; i++){
                System.out.print("\t");
            }
            System.out.println(root.data);
        }
        else {
            System.out.println(root.data);
        }

        display(root.left, level+1);

    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        bt.populate(scanner);
        bt.display();
    }
}
