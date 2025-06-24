//    package BT;
//
//    import java.util.*;
//
//    class BST {
//         int diameter = 0;
//        Integer max = Integer.MIN_VALUE;
//         int count = 0;
//        int preIndex = 0;
//        public static void main(String[] args) {
//
//            BST bt = new BST();
//           bt.insert(-15);
//           bt.insert(10);
//           bt.insert(20);
//           bt.insert(15);
//
//            int[] preorder = {3,9,20,15,7};
//            int[] inorder = {9,3,15,20,7};
////            System.out.println(bt.buildTree(preorder, inorder));
//            System.out.println(bt.maxPathSum());
//        }
//
//        public int maxPathSum(TreeNode root) {
//            if(root == null){
//                return 0;
//            }
//            int left = maxPathSum(root.left);
//            int right = maxPathSum(root.right);
//
//            if(left >= 0 && right >= 0 && root.val >= 0){
//                Integer curr_max = left + right + root.val;
//                max = Math.max(curr_max, max);
//                return curr_max;
//            }
//            if(root.val < 0){
//                return 0;
//            }
//            Integer child = helper(left, right);
//            return root.val + child;
//
//        }
//        public Integer helper(Integer left, Integer right){
//            return left < 0 ? right : left;
//        }
//        public  TreeNode buildTree(int[] preorder, int[] inorder) {
//            HashMap<Integer, Integer> map = new HashMap<>();
//            for(int i = 0; i < inorder.length; i++){
//                map.put(inorder[i], i);
//            }
//            return helper(preorder, map,  0, inorder.length - 1);
//        }
//        public TreeNode helper(int[] preorder, HashMap<Integer, Integer> map, int start, int end){
//            if(start > end){
//                return null;
//            }
//            int rootVal = preorder[preIndex++];
//            TreeNode node = new TreeNode(rootVal);
//            int rootIndx = map.get(rootVal);
//            node.left = helper(preorder,map, start, rootIndx - 1);
//            node.right = helper(preorder,map, rootIndx+1, end);
//
//            return node;
//        }
//        public static class TreeNode {
//
//            private int val;
//
//            private TreeNode left;
//            private TreeNode right;
//            private TreeNode next;
//            private int height;
//            public TreeNode(){
//
//            }
//
//            public TreeNode(int value) {
//                this.val = value;
//            }
//
//            public int getVal() {
//                return val;
//            }
//        }
//
//        public static TreeNode root;
//
//        public BST() {
//
//        }
//
//        public int height(TreeNode node) {
//            if (node == null) {
//                return -1;
//            }
//            return node.height;
//        }
//
//        public boolean isEmpty() {
//            return root == null;
//        }
//
//        public void insert(int value) {
//            root = insert(value, root);
//        }
//
//        private TreeNode insert(int value, TreeNode node) {
//            if (node == null) {
//                node = new TreeNode(value);
//                return node;
//            }
//
//            if (value < node.val) {
//                node.left = insert(value, node.left);
//            }
//
//            if (value > node.val) {
//                node.right = insert(value, node.right);
//            }
//
//            node.height = Math.max(height(node.left), height(node.right)) + 1;
//            return node;
//        }
//
//        public void populate(int[] nums) {
//            for (int i = 0; i < nums.length; i++) {
//                this.insert(nums[i]);
//            }
//        }
//
////        public void populatedSorted(int[] nums) {
////            populatedSorted(nums, 0, nums.length);
////        }
////
////        private void populatedSorted(int[] nums, int start, int end) {
////            if (start >= end) {
////                return;
////            }
////
////            int mid = (start + end) / 2;
////
////            this.insert(nums[mid]);
////            populatedSorted(nums, start, mid);
////            populatedSorted(nums, mid + 1, end);
////        }
//public void prettyDisplay(){
//    prettyDisplay(root, 0);
//}
//        public void prettyDisplay(TreeNode node, int level){
//            if(node == null){
//                return;
//            }
//            prettyDisplay(node.right, level + 1);
//            if(level != 0){
//                for(int i = 0; i < level; i++){
//                    System.out.print("\t");
//                }
//                System.out.println(node.val);
//            }
//            else {
//                System.out.println(node.val);
//            }
//
//            prettyDisplay(node.left, level+ 1);
//        }
//
//        public boolean balanced() {
//            return balanced(root);
//        }
//
//        private boolean balanced(TreeNode node) {
//            if (node == null) {
//                return true;
//            }
//            return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
//        }
//
//        public void display() {
//            display(this.root, "Root TreeNode: ");
//        }
//
//        private void display(TreeNode node, String details) {
//            if (node == null) {
//                return;
//            }
//            System.out.println(details + node.val);
//            display(node.left, "Left child of " + node.val + " : ");
//            display(node.right, "Right child of " + node.val + " : ");
//        }
//        public void bfsLevelOrder(TreeNode node){
//            Queue<TreeNode> ans=  new LinkedList<>();
//            ans.add(node);
//            while(!ans.isEmpty()){
//                TreeNode temp = ans.poll();
//                System.out.print(STR."\{temp.val} ");
//                if(temp.left != null){
//                    ans.add(temp.left);
//                }
//                if(temp.right != null){
//                    ans.add(temp.right);
//                }
//
//            }
//        }
//        //returns bfs list at every level
//        public List<List<Integer>> bfsOrder(TreeNode node){
//            List<List<Integer>> result = new ArrayList<>();
//            Queue<TreeNode> ans = new LinkedList<>();
//            ans.offer(node);
//            while (!ans.isEmpty()){
//                int len = ans.size();
//                List<Integer> level = new ArrayList<>();
//
//                for(int i = 0; i < len; i++) {
//                    TreeNode tree = ans.poll();
//                    assert tree != null;
//                    level.add(tree.val);
//                    if (tree.left != null) {
//                        ans.add(tree.left);
//                    }
//                    if (tree.right != null) {
//                        ans.add(tree.right);
//                    }
//                }
//                result.add(level);
//            }
//            return result;
//        }
//
//        //Question 2 - Average of levels in binary tree
//        public List<Double> averageOfLevels(TreeNode root){
//            List<Double> result = new ArrayList<>();
//            Queue<TreeNode> ans = new LinkedList<>();
//            ans.offer(root);
//
//            while (!ans.isEmpty()){
//                int len = ans.size();
//                double sum =  0;
//                for(int i = 0; i < len; i++){
//                    TreeNode tree = ans.poll();
//                    sum = sum + tree.val;
//                    if(tree.left != null){
//                        ans.add(tree.left);
//                    }
//                    if(tree.right != null){
//                        ans.add(tree.right);
//                    }
//                }
//                sum = sum / len;
//                result.add(sum);
//            }
//            return result;
//        }
//        //Question 3
//        public int getNextNumberLevelOrder(TreeNode root, int val){
//            if(root == null){
//                return 0;
//            }
//            TreeNode tree;
//            Queue<TreeNode> queue = new LinkedList<>();
//            queue.add(root);
//            while (!queue.isEmpty()){
//                TreeNode temp = queue.poll();
//                if(temp.left != null){
//                    queue.add(temp.left);
//                }
//                if(temp.right != null){
//                    queue.add(temp.right);
//                }
//                if(temp.val == val){
//                    return queue.peek().val;
//                }
//            }
//            return 0;
//        }
//
//        //Question 4 ZigZAg LevelOrder Traversal
//        public List<List<Integer>> zigzagLevelOrder(TreeNode node){
//            List<List<Integer>> result = new ArrayList<>();
//            if(node == null){
//                return result;
//            }
//            Deque<TreeNode> deque = new LinkedList<>();
//            deque.add(node);
//            boolean left2Right = true;
//            while (!deque.isEmpty()){
//                List<Integer> temp = new ArrayList<>();
//                int len = deque.size();
//                if(left2Right) {
//
//                    for(int i = 0; i < len; i++){
//                        TreeNode tree = deque.pop();
//                        temp.add(tree.val);
//                        if(tree.left != null){
//                            deque.add(tree.left);
//                        }
//                        if(tree.right != null){
//                            deque.add(tree.right);
//                        }
//                    }
//                    left2Right = false;
//                    result.add(temp);
//                }
//                else{
//                    for(int i = 0; i < len; i++){
//                        TreeNode tree = deque.removeLast();
//                        temp.add(tree.val);
//                        if(tree.right != null){
//                            deque.addFirst(tree.right);
//                        }
//                        if(tree.left != null){
//                            deque.addFirst(tree.left);
//                        }
//                    }
//                    result.add(temp);
//                    left2Right = true;
//                }
//
//            }
//            return result;
//        }
//
//        //question 5 levelOrder traversal from below
//        public List<List<Integer>> traverseFromEnd(TreeNode node) {
//            List<List<Integer>> result = new LinkedList<>();
//            if (node == null) {
//                return result;
//            }
//            Queue<TreeNode> level = new LinkedList<>();
//            level.add(node);
//            while (!level.isEmpty()) {
//                int len = level.size();
//                List<Integer> ans = new ArrayList<>();
//                for (int i = 0; i < len; i++) {
//                    TreeNode temp = level.poll();
//                    ans.add(temp.val);
//                    if (temp.left != null){
//                        level.add(temp.left);
//                    }
//                    if(temp.right != null){
//                        level.add(temp.right);
//                    }
//                }
//                result.addFirst(ans);
//            }
//            return result;
//        }
//
//        //question populating next pointer
//        public List<String> populatingNextRightPointer(TreeNode node){
//            List<String> result = new LinkedList<>();
//            if(node == null){
//                return result;
//            }
//            Queue<TreeNode> level = new LinkedList<>();
//            level.add(node);
//            while (!level.isEmpty()){
//                int len = level.size();
//
//                for(int i = 0; i < len; i++){
//                    TreeNode temp = level.poll();
//                    result.add(String.valueOf(temp.val));
//                    if(i == len - 1){
//                        result.add("#");
//                    }
//                    if(temp.left != null){
//                        level.add(temp.left);
//                    }
//                    if(temp.right != null){
//                        level.add(temp.right);
//                    }
//                }
//            }
//            return result;
//        }
//
//        //question populating next pointer(Another way){
//        public TreeNode connectToRight(TreeNode node){
//            if(node == null){
//                return null;
//            }
//
//            TreeNode leftMost = node;
//            while (leftMost.left != null){
//                TreeNode current = leftMost;
//                while (current != null){
//                    current.left.next = current.right;
//                    if(current.next != null){
//                        current.right.next = current.next.left;
//                    }
//                    current = current.next;
//                }
//                leftMost = leftMost.left;
//            }
//            return node;
//        }
//
//        //question Tree right side view
//        public List<Integer> rightSideView(TreeNode node){
//           if(node == null){
//               return new LinkedList<>();
//           }
//           List<Integer> result = new LinkedList<>();
//           Queue<TreeNode> level = new LinkedList<>();
//           level.add(node);
//           while (!level.isEmpty()){
//               int len = level.size();
//               for(int i = 0; i < len; i++){
//                   TreeNode temp = level.poll();
//                   if(i == len - 1){
//                       result.add(temp.val);
//                       if(temp.left != null){
//                           level.add(temp.left);
//                       }
//                       if(temp.right != null){
//                           level.add(temp.right);
//                       }
//                   }
//                   else {
//                       if(temp.left != null){
//                           level.add(temp.left);
//                       }
//                       if(temp.right != null){
//                           level.add(temp.right);
//                       }
//                   }
//               }
//           }
//           return result;
//        }
//        //questions are the nodes cousins
//        public boolean CosuinsOrNot(TreeNode node, int x, int y){
//            TreeNode xx = findNode(node, x);
//            TreeNode yy = findNode(node, y);
//
//            return ((getLevelOfNode(node, x) == getLevelOfNode(node, y) && (!isSibing(node, xx, yy))));
//        }
//
//        private boolean isSibing(TreeNode node, TreeNode xx, TreeNode yy) {
//            if(node == null){
//                return false;
//            }
//            if(node.left == xx && node.right == yy || node.left == yy && node.right == xx){
//                return false;
//            }
//            return true;
//        }
//
//        //level of the ListNode
//        public int getLevelOfNode(TreeNode node, int x) {
//            if (node == null) {
//                return -1;
//            }
//            Queue<TreeNode> result = new LinkedList<>();
//            result.add(node);
////            int len = 0;
//            int level = -1;
//            while (!result.isEmpty()) {
//                int len = result.size();
//                level += 1;
//                for (int i = 0; i < len; i++){
//
//                    TreeNode temp = result.poll();
//                    if(temp.val == x){
//                        return level;
//                    }
//                    if(temp.left != null){
//                        result.add(temp.left);
//                    }
//                    if(temp.right != null){
//                        result.add(temp.right);
//                    }
//                }
//            }
//            return -1;
//        }
//
//        //Find the node
//        public TreeNode findNode(TreeNode node, int x){
//            if(node == null){
//                return null;
//            }
//            if(node.val == x){
//                return node;
//            }
//            TreeNode n = findNode(node.left, x);
//            if(n != null){
//                return n;
//            }
//            return findNode(node.right, x);
//        }
//
//        //Tree symetric
//        public boolean isTreeSymetric(TreeNode node) {
//            if (node == null) {
//                return false;
//            }
//            Queue<TreeNode> left = new LinkedList<>();
//            Queue<TreeNode> right = new LinkedList<>();
//
//            left.add(node.left);
//            right.add(node.right);
//
//            while (!left.isEmpty() && !right.isEmpty()) {
//                TreeNode leftNode = left.poll();
//                TreeNode rightNode = right.poll();
//
//                if (leftNode == null && rightNode == null) continue;
//                if (leftNode == null || rightNode == null) return false;
//                if (leftNode.val != rightNode.val) return false;
//
//                left.add(leftNode.left);
//                left.add(leftNode.right);
//                right.add(rightNode.right);
//                right.add(rightNode.left);
//            }
//            return true;
//        }
//        //qeustion diameter of a bianry tree
//        public int getDiameter(TreeNode node){
//            heightOfTree(node);
//            return diameter - 1;
//        }
//        public int heightOfTree(TreeNode node){
//            if(node == null){
//                return 0;
//            }
//            int leftHeight = heightOfTree(node.left);
//            int rightHeight = heightOfTree(node.right);
//            int dia = (leftHeight + rightHeight ) + 1;
//            diameter  = Math.max(dia, diameter);
//            return Math.max(leftHeight, rightHeight) + 1;
//        }
//        //question invert a binary tree
//
//        public TreeNode invertTree(TreeNode node){
//            if(node == null){
//                return null;
//            }
//            TreeNode leftNode = invertTree(node.left);
//            TreeNode rightNode = invertTree(node.right);
//            node.left = rightNode;
//            node.right = leftNode;
//            return node;
//        }
//        //maximum depth of binary tree
//        public int maxDepth(TreeNode root){
//            return heightOfRootToLeafNode(root) ;
//        }
//
//        private int heightOfRootToLeafNode(TreeNode root) {
//            if(root == null){
//                return 0;
//            }
//            int leftHt = heightOfRootToLeafNode(root.left);
//            int rightHt = heightOfRootToLeafNode(root.right);
//            return Math.max(leftHt, rightHt)  + 1;
//        }
//        //form Binary Search Tree from sorted Array
////        public TreeNode sortedArrayToBST(int[] nums) {
////            root =  formBinarySearchTree(nums, 0, nums.length - 1);
////            return root;
////        }
//
//        private TreeNode formBinarySearchTree(int[] nums, TreeNode root, int start, int end) {
//            if(root == null){
//                int mid = start + (end - start) / 2;
//                root = insert(nums[mid], root);
//                return root;
//            }
//            if(start == end){
//                insert(start, root);
//            }
//            if(start > end){
//                return null;
//            }
//            int mid = start + (end - start) / 2;
//            insert(nums[mid]);
//            return new TreeNode(root.getVal());
//        }
//        //flatten binary treee
//        public Queue<TreeNode> flatten(TreeNode root) {
//
//            Queue<TreeNode> level = new LinkedList<>();
//            Queue<TreeNode> ans = new LinkedList<>();
//            ans.add(root);
//            while (!ans.isEmpty()){
//                int len = ans.size();
//                for(int i = 0; i < len; i++){
//                    TreeNode temp = ans.poll();
//                    level.add(temp);
//                    if(temp.left != null){
//                        ans.add(temp.left);
//                    }
//                    if(temp.right != null){
//                        ans.add(temp.right);
//                    }
//                }
//            }
//            return level;
//        }
//        public void buildTree(Queue<TreeNode> ans){
//            int le= ans.size();
////            for()
//        }
//        public void flatten1(TreeNode root){
//            TreeNode current = root;
//            while (current != null){
//                if(current.left != null){
//                    TreeNode temp = current.left;
//                    while (temp.right != null){
//                        temp = temp.right;
//                    }
//                    temp.right = current.right;
//                    current.right = current.left;
//                }
//                current.left = null;
//                current = current.right;
//            }
//        }
//
//        public TreeNode getLca(TreeNode node, TreeNode p, TreeNode q){
//            if(node == null ){
//                return null;
//            }
//            if(node == p || node == q){
//                return node;
//            }
//            TreeNode left = getLca(node.left, p, q);
//            TreeNode right = getLca(node.right, p, q);
//
//            if(left != null && right !=null){
//                return node;
//            }
//            return left == null ? right : left;
//        }
//
//        //question get kth smallest number from a binary search tree
//        public int kthSmallest(TreeNode root, int k) {
////            int count = 0;
//            TreeNode node = getKthSmallest(root, k);
//            return node.val;
//        }
//        public TreeNode getKthSmallest(TreeNode root, int k) {
//
//            if (root == null) {
//                return null;
//            }
//            TreeNode left = getKthSmallest(root.left, k);
//            if (left != null) {
//                return root;
//            }
//            count += 1;
//            if (count == k) {
//                return root;
//            }
//            return getKthSmallest(root.right, k);
//        }
//
//
//
//    }