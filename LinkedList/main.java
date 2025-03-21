package LinkedList;

public class main {
    public static void main(String[] args) {
       LL list1 = new LL();
       LL list2 = new LL();
       LL l3 = new LL();

      list1.insertLast(1);
      list1.insertLast(2);
      list1.insertLast(3);
      list1.insertLast(4);
      list1.insertLast(5);
      list1.rotateRight(list1.head, 2);
//       list1.display();
        System.out.println(2 % 6);
    }
}
