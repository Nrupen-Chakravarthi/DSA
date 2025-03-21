package LinkedList;

public class DLL {
    int size;
    Node head;
    Node tail;
    DLL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        if(size == 0){
            Node node = new Node(value);
            node.next = null;
            node.prev = null;
            head = node;
            size++;
            return;
        }
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
        size++;
        if(tail == null){
            tail = head;
        }
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
        node.prev = temp;
        node.next = null;
        tail = node;
        size++;
    }
    public void insertAtIndex(int val, int index){
        if(size == 0){
            insertFirst(val);
            return;
        }
        Node node = head;
        for(int i = 0; i < index - 2; i++){
            node = node.next;
        }
        Node newNode = new Node(val);
        newNode.next = node.next;
        node.next = newNode;
        newNode.prev = node;
        newNode.next.prev = newNode;
        size++;
    }
    public void deleteFirst(){
        Node node = head.next;
        head.next = null;
        node.prev = null;
        head = node;
        size--;
    }
    public void deleteLast(){
        Node node = tail.prev;
        node.next = null;
        tail.prev = null;
        tail = node;
        size--;
    }
    public void deleteAtIndex(int index){
        if(index == size){
            deleteLast();
            return;
        }
        Node node = head;
        for(int i = 0; i < index - 2; i++){
            node = node.next;
        }
        node.next = node.next.next;
        node.next.prev = node;
        size--;
    }
    public void display(){
        Node node = head;
        System.out.print("HEAD --->");
        while (node != null){
            System.out.print(node.value+ " ---> ");
            node = node.next;
        }
        System.out.println("TAIL");
        Node last = tail;
        System.out.print("TAIL --->");
        while (last != null){
            System.out.print(last.value+ " --->");
            last = last.prev;
        }
        System.out.println("HEAD");
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
        Node(int val, Node next, Node prev){
            this.value = val;
            this.prev = prev;
            this.next = next;
        }
    }

}
