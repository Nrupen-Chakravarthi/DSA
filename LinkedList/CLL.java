package LinkedList;

public class CLL {
    Node head;
    Node tail;

    public void insertFirst(int value){
        if(head == null){
            Node node = new Node(value);
            head = node;
            tail = node;
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public void deleteFirst(){
        Node temp = head.next;
        tail.next = head.next;
        head = temp;
    }
    public void deleteLast(){
        Node node = head;
        while (node.next != tail){
            node = node.next;
        }
        node.next = tail.next;
        tail = node;
    }
    public void display(){
        Node node = head;
        while (node.next != head){
            System.out.print(node.value+ " --> ");
            node = node.next;
        }
        System.out.print(node.value+ " -->");
        System.out.println(node.next.value);
    }
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
}
