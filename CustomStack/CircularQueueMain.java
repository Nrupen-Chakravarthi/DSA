package CustomStack;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue c = new CircularQueue();
        c.insert(1);
        c.insert(2);
        c.insert(3);
        c.insert(4);
//        c.insert(5);
        c.remove();
        c.display();

    }
}
