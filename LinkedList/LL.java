package LinkedList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LL {
    public ListNode head;
    public ListNode tail;
    private int size;
    public  class ListNode {
        private int value;
        private ListNode next;

        ListNode() {
        }
        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
    LL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        ListNode node = new ListNode(value);
        temp.next = node;
        tail = node;
        size += 1;
    }
    public void insertAtIndex(int value, int index){
        if(index == size){
            insertLast(value);
            return;
        }
        ListNode temp = head;
        int i = 0;
        while ( i < index - 1){
            temp = temp.next;
            i++;
        }
        ListNode node = new ListNode(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public void deleteFirst(){
        ListNode node = head.next;
        head = node;
        size--;
    }

    public void deleteLast(){
        ListNode node = head;
        while (node.next.next != null){
            node = node.next;
        }
        node.next = null;
        tail = node;
        size--;
    }

    public void deleteAtIndex(int index){
        ListNode temp = head;
        for(int i = 0; i < index - 2; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public static LL mergeTwoLists(LL list1, LL list2){
        ListNode f = list1.head;
        ListNode s = list2.head;
        LL ans = new LL();
        while (f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else {
                ans.insertLast(s.value);
                s = s.next;
            }
            while (f != null){
                ans.insertLast(f.value);
                f = f.next;
            }
            while (s != null){
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        return ans;
    }
    public boolean hasCycle(ListNode head){
        HashMap<ListNode, Integer> ans = new HashMap<ListNode, Integer>();
        ListNode temp = head;
        while (temp != null){
            ans.put(temp, ans.getOrDefault(temp, 0) + 1);
            if(ans.get(temp) > 1){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public boolean hasCycleOrNot(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public int getLengthOfCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                ListNode temp = slow;
                int len = 0;
                do {
                    temp = temp.next;
                    len++;
                }while (temp != slow);
                return len;
            }
        }
        return 0;
    }
    public ListNode detectCycleStartNode(ListNode head){
        int length = 0;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                length = getLengthOfCycle(head);
            }
        }
        ListNode f = head;
        ListNode s = head;

        while (length > 0){
            s = s.next;
            length--;
        }
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return f;

    }



    public ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode newTail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                tail.next = list1;
                list1 = list2.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
            while (list1 != null){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            while (list2 != null){
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
            dummyHead = dummyHead.next;
            return dummyHead;
        }
        public ListNode reverseList(ListNode head) {
        if(head == null ||  head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
//    public ListNode sortList(ListNode list1){
//        if(list1 == null || list1.next == null){
//            return list1;
//        }
//        ListNode mid = getMiddle(list1);
//        ListNode left = sortList(list1);
//        ListNode right = sortList(mid);
//        return merge(left, right);
//    }
//    public void reverseList(ListNode head, ListNode tail){
//        if(head == tail){
//            return;
//        }
//        reverseList(head.next, tail);
//        tail.next = head;
//        tail = head;
//        tail.next = null;
//    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode leftPrev = dummyHead;
        ListNode curr = head;

        for(int i = 0; i < left - 1;i++){
            leftPrev = curr;
            curr = curr.next;
        }

        ListNode prev = null;
        for(int i = 0; i < right - left + 1; i++){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        leftPrev.next.next = curr;
        leftPrev.next = prev;
        return dummyHead.next;
    }

    public ListNode getNode(ListNode head, int left) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        int count = 1;
        while (temp.next != null && count < left) {
            temp = temp.next;
            count += 1;
        }
        return temp;
    }
    public ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseListRecursivley(ListNode head) {
        if(head == null ||  head.next == null){
            return head;
        }
        ListNode newHead  = reverseListRecursivley(head.next);
        head.next.next = head;
        head.next = null;
        return  newHead;
    }
    public boolean isPalindrome(ListNode head){
        ListNode middle = getMiddle(head);
        ListNode secondHead = reverseListRecursivley(middle);
        ListNode reversereverseHead = secondHead;

        while (head != null && secondHead != null){
            if(head.value != secondHead.value){
                return false;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseListRecursivley(reversereverseHead);
        return true;
    }

    public ListNode returnSecondead(ListNode head){
        ListNode middle = getMiddle(head);
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode leftPrev = dummyHead;
        ListNode curr = head;
        while (curr != middle){
            leftPrev = curr;
            curr = curr.next;
        }
        ListNode prev = null;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        leftPrev.next = prev;
        return prev;
    }
    public void  reorderList(ListNode head){
//        ListNode mid = getMiddle(head);
        ListNode SecondHead = returnSecondead(head);
        ListNode dummyHead = SecondHead;
        ListNode firstHead = head;

        while (firstHead != null && SecondHead != null){

            ListNode temp1 = firstHead.next;

            ListNode temp2 = SecondHead.next;

            firstHead.next = SecondHead;
            firstHead = temp1;
            if(firstHead == dummyHead){
                break;
            }
            SecondHead.next = firstHead;
            SecondHead = temp2;
        }
    }

    public ListNode reverseBetweenKunal(ListNode head, int left, int right){
        if(left == right){
            return head;
        }
        ListNode leftPrev = null;
        ListNode curr = head;

        for(int i = 0; i < left - 1; i++){
            leftPrev = curr;
            curr = curr.next;
        }
        ListNode newEnd = curr;


        ListNode prev = null;
        ListNode next = curr.next;
        for(int i = 0; i < right - left + 1; i++){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }
        if(leftPrev != null){
            leftPrev.next = prev;
        }
        else {
            head = prev;
        }
        newEnd.next = curr;
        return head;
    }
    boolean checkCotnainsKItems(ListNode node, int k) {
        for(int i = 0; i < k; i++){
            if(node != null){
                node = node.next;
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public ListNode reverseKGroup(ListNode head, int k){
        if(k<=1 || head == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        boolean ans = true;

        while (checkCotnainsKItems(curr, k)){
            ListNode temp = curr;


            ListNode newLast = curr;
            ListNode last = prev;
            ListNode next = curr.next;
            for(int i = 0; i < k; i++){
                curr.next = prev;
                prev = curr;
                curr = next;
                if (next != null) {
                    next = next.next;
                }
                else {
//                    prev.next = null;
                    break;
                }
            }

            if(last != null){
                last.next = prev;
            }
            else {
                head = prev;
            }
            newLast.next = curr;
            if(curr == null){
                break;
            }
            prev = newLast;
        }
        return head;
    }

    public ListNode rotateRight(ListNode head, int k) {
       if(k <= 0  || head == null || head.next == null){
           return head;
       }
       ListNode temp = head;
       int len = 1;
       while (temp.next != null){
           temp = temp.next;
           len += 1;
       }
       temp.next = head;
       int rotations = k % len;
       int skip = len - rotations;
       ListNode last = head.next;
       for(int i = 0; i < skip - 1; i++){
           last = last.next;
       }
       head = last.next;
       last.next = null;
        return head;
    }
    public void reorderList1(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = getMiddle1(head);
        ListNode hs = reverseList1(mid);
        ListNode hf = head;

        // Merging the two halves
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null){
            hf.next = null;
        }
    }

    private ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private ListNode getMiddle1(ListNode head) {
        ListNode slow = head, fast = head;
//        ListNode prev = null;

        while (fast != null && fast.next != null) {
//            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.value));
        for(ListNode i : lists){
            if(i != null){
                queue.add(i);
            }
        }

        ListNode newHead = new ListNode();
        ListNode tail = newHead;

        while(!queue.isEmpty()){
            ListNode temp = queue.poll();
            tail.next = temp;
            tail = temp;

            if(temp.next != null){
                queue.add(temp.next);
            }
        }
        return newHead.next;
    }

}









