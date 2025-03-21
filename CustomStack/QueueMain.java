package CustomStack;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
//        q.insert(5);
        q.pop();
        q.display();

    }
}
