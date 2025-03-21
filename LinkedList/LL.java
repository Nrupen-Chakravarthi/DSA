package LinkedList;

import Recursion.CheckArraySorted;

import javax.swing.plaf.IconUIResource;
import javax.xml.stream.events.NotationDeclaration;
import java.util.HashMap;

public class LL {
    public Node head;
    public Node tail;
    private int size;
    public  class Node {
        private int value;
        private Node next;

        Node() {
        }
        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    LL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
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
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(value);
        temp.next = node;
        tail = node;
        size += 1;
    }
    public void insertAtIndex(int value, int index){
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        int i = 0;
        while ( i < index - 1){
            temp = temp.next;
            i++;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public void deleteFirst(){
        Node node = head.next;
        head = node;
        size--;
    }

    public void deleteLast(){
        Node node = head;
        while (node.next.next != null){
            node = node.next;
        }
        node.next = null;
        tail = node;
        size--;
    }

    public void deleteAtIndex(int index){
        Node temp = head;
        for(int i = 0; i < index - 2; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public static LL mergeTwoLists(LL list1, LL list2){
        Node f = list1.head;
        Node s = list2.head;
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
    public boolean hasCycle(Node head){
        HashMap<Node, Integer> ans = new HashMap<Node, Integer>();
        Node temp = head;
        while (temp != null){
            ans.put(temp, ans.getOrDefault(temp, 0) + 1);
            if(ans.get(temp) > 1){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public boolean hasCycleOrNot(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public int getLengthOfCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                Node temp = slow;
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
    public Node detectCycleStartNode(Node head){
        int length = 0;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                length = getLengthOfCycle(head);
            }
        }
        Node f = head;
        Node s = head;

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



    public Node merge(Node list1, Node list2){
        Node dummyHead = new Node();
        Node newTail = dummyHead;
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
        public Node reverseList(Node head) {
        if(head == null ||  head.next == null){
            return head;
        }
        reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return head;
    }
//    public Node sortList(Node list1){
//        if(list1 == null || list1.next == null){
//            return list1;
//        }
//        Node mid = getMiddle(list1);
//        Node left = sortList(list1);
//        Node right = sortList(mid);
//        return merge(left, right);
//    }
//    public void reverseList(Node head, Node tail){
//        if(head == tail){
//            return;
//        }
//        reverseList(head.next, tail);
//        tail.next = head;
//        tail = head;
//        tail.next = null;
//    }
    public Node reverseBetween(Node head, int left, int right) {
        Node dummyHead = new Node();
        dummyHead.next = head;

        Node leftPrev = dummyHead;
        Node curr = head;

        for(int i = 0; i < left - 1;i++){
            leftPrev = curr;
            curr = curr.next;
        }

        Node prev = null;
        for(int i = 0; i < right - left + 1; i++){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        leftPrev.next.next = curr;
        leftPrev.next = prev;
        return dummyHead.next;
    }

    public Node getNode(Node head, int left) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        int count = 1;
        while (temp.next != null && count < left) {
            temp = temp.next;
            count += 1;
        }
        return temp;
    }
    public Node getMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverseListRecursivley(Node head) {
        if(head == null ||  head.next == null){
            return head;
        }
        Node newHead  = reverseListRecursivley(head.next);
        head.next.next = head;
        head.next = null;
        return  newHead;
    }
    public boolean isPalindrome(Node head){
        Node middle = getMiddle(head);
        Node secondHead = reverseListRecursivley(middle);
        Node reversereverseHead = secondHead;

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

    public Node returnSecondead(Node head){
        Node middle = getMiddle(head);
        Node dummyHead = new Node();
        dummyHead.next = head;
        Node leftPrev = dummyHead;
        Node curr = head;
        while (curr != middle){
            leftPrev = curr;
            curr = curr.next;
        }
        Node prev = null;
        while (curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        leftPrev.next = prev;
        return prev;
    }
    public void  reorderList(Node head){
//        Node mid = getMiddle(head);
        Node SecondHead = returnSecondead(head);
        Node dummyHead = SecondHead;
        Node firstHead = head;

        while (firstHead != null && SecondHead != null){

            Node temp1 = firstHead.next;

            Node temp2 = SecondHead.next;

            firstHead.next = SecondHead;
            firstHead = temp1;
            if(firstHead == dummyHead){
                break;
            }
            SecondHead.next = firstHead;
            SecondHead = temp2;
        }
    }

    public Node reverseBetweenKunal(Node head, int left, int right){
        if(left == right){
            return head;
        }
        Node leftPrev = null;
        Node curr = head;

        for(int i = 0; i < left - 1; i++){
            leftPrev = curr;
            curr = curr.next;
        }
        Node newEnd = curr;


        Node prev = null;
        Node next = curr.next;
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
    boolean checkCotnainsKItems(Node node, int k) {
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
    public Node reverseKGroup(Node head, int k){
        if(k<=1 || head == null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        boolean ans = true;

        while (checkCotnainsKItems(curr, k)){
            Node temp = curr;


            Node newLast = curr;
            Node last = prev;
            Node next = curr.next;
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

    public Node rotateRight(Node head, int k) {
       if(k <= 0  || head == null || head.next == null){
           return head;
       }
       Node temp = head;
       int len = 1;
       while (temp.next != null){
           temp = temp.next;
           len += 1;
       }
       temp.next = head;
       int rotations = k % len;
       int skip = len - rotations;
       Node last = head.next;
       for(int i = 0; i < skip - 1; i++){
           last = last.next;
       }
       head = last.next;
       last.next = null;
        return head;
    }


}









