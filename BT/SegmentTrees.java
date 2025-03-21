package BT;

public class SegmentTrees {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        SegmentTrees bt = new SegmentTrees();

        bt.SegmentTree(arr);
        bt.update(1, -1, 0, arr.length - 1);
        bt.prettyDisplay();
        System.out.println(bt.query(2, 4));
    }

    public class Node{
        int data;
        Node left;
        Node right;
        int startInterval;
        int endInterval;
        Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    public Node root;

    public void SegmentTree(int[] arr){
        this.root = buildTree(arr,0, arr.length - 1);
    }
    public Node buildTree(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start, end);
        int mid = start + (end - start) / 2;
        node.left = buildTree(arr, start, mid);
        node.right = buildTree(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }
    public void prettyDisplay(){
        prettyDisplay(root);
    }
    public void prettyDisplay(Node node){
        if(node == null){
            return;
        }
        prettyDisplay(node.left);
        prettyDisplay(node.right);
        System.out.println("Start interval is: "+node.startInterval+ " end interval: "+node.endInterval+ " sum is: "+node.data);
    }
    public int query(int qsi, int qei){
        return query(root, qsi, qei);
    }
    public int query(Node node, int qsi, int qei){
        if(node.startInterval >= qsi && node.endInterval <= qei){
            return node.data;
        }
        else if (node.endInterval < qsi || node.startInterval > qei){
            return 0;
        }
        else {
            return query(node.left, qsi, qei) + query(node.right, qsi, qei);
        }
    }
    public void update(int indx, int value, int start, int end){
        root = updateIndx(root, indx,  value, start, end);
    }
    public Node  updateIndx(Node node, int indx, int val, int start, int end){
        if(start == end && start == indx){
            node.data = val;
            return node;
        }
        int mid = start + (end - start) / 2;
        if(indx <= mid){
            node.left = updateIndx(node.left, indx, val, start, mid);
            node.data = node.left.data + node.right.data;
        }
        else {
            node.right = updateIndx(node.right, indx, val, mid+ 1, end);
            node.data = node.left.data + node.right.data;
        }
        return node;
    }
}

