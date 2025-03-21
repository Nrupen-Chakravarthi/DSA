//package BT;
//
//import Recursion.BinarySearch;
//
//public class BST1 {
//    public static void Main(String[] args) {
//        BST1 bt = new BST1();
//        bt.insert(6);
//        bt.insert(10);
//        bt.insert(4);
//        bt.insert(5);
//        bt.insert(2);
//        bt.insert(1);
//        bt.prettyDisplay();
//        System.out.println(bt.isBalanced());
//    }
//    public class Node{
//        int data;
//        Node left;
//        Node right;
//        int height;
//        Node(int data){
//            this.data = data;
//        }
//
//    }
//    public Node root;
//    public void insert(int data){
//        root = insert(data, root);
//    }
//    public int height(Node node){
//        if(node == null){
//            return -1;
//        }
//        return node.height;
//    }
//    public Node insert(int data, Node node){
//        if(node == null){
//            node = new Node(data);
//            return node;
//        }
//        if(data < node.data){
//            node.left = insert(data, node.left);
//        }
//        if (data > node.data){
//            node.right = insert(data, node.right);
//        }
//        node.height = Math.max(height(node.left), height(node.right)) + 1 ;
//        return rotate(node);
//    }
//
//    public Node rotate(Node node){
//        if(height(node.left) - height(node.right) > 1){
//            if(height(node.left.left) - height(node.right.right) > 0){
//                //left heavy
//               return rightRotate(node);
//            }
//            if(height(node.left.left) - height(node.right.right) < 0){
//                //left left case. rotate right case
//                node.left = leftRotate(node.left);
//                return rightRotate(node);
//            }
//        }
//        if(height(node.right) - height(node.left) > 1){
//            if(height(node.right.right) - height(node.right.left) > 0 ){
//                leftRotate(node);
//            }
//            if(height(node.right.right) - height(node.right.left) < 0){
//                node.right = rightRotate(node.right);
//                return rightRotate(node);
//            }
//        }
//        return node;
//    }
//    public Node rightRotate(Node p){
//        Node c = p.left;
//        Node leaf = c.right;
//        p.left = null;
//        c.right = p;
//        p.left = leaf;
//
//        p.height = Math.max(height(p.left), height(p.right)) + 1;
//        c.height = Math.max(height(c.left), height(c.right)) + 1;
//
//        return c;
//    }
//    public Node leftRotate(Node p){
//        Node c = p.right;
//        Node leaf = c.left;
//        p.right = null;
//        c.left = p;
//        root.right = leaf;
//
//        p.height = Math.max(height(p.left), height(p.right)) + 1;
//        c.height = Math.max(height(c.left), height(c.right)) + 1;
//
//        return c;
//    }
//
//
//    public boolean isBalanced(){
//        return isBalanced(root
//        );
//    }
//    public boolean isBalanced(Node node){
//        if(node == null){
//            return true;
//        }
//        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
//     }
//    public void prettyDisplay(){
//        prettyDisplay(root, 0);
//    }
//    public void prettyDisplay(Node node, int level){
//        if(node == null){
//            return;
//        }
//        prettyDisplay(node.right, level + 1);
//        if(level != 0){
//            for(int i = 0; i < level; i++){
//                System.out.print("\t");
//            }
//            System.out.println(node.data);
//        }
//        else {
//            System.out.println(node.data);
//        }
//
//        prettyDisplay(node.left, level+ 1);
//    }
//
//
//}
