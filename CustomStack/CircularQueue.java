package CustomStack;

public class CircularQueue {
    int end = 0;
    int front = 0;
    int size = 0;
    int[] arr;
    public static final int DEFAULT_SIZE = 4;

    CircularQueue(){
        this(DEFAULT_SIZE);
    }
    CircularQueue(int size){
        this.arr = new int[size];
    }
    public boolean isFull(){
        return size == arr.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        arr[end++] = item;
        size++;
        end = end % arr.length;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from a empty queue");
        }
        int removed = arr[front++];
        front = front % arr.length;
        size--;
        return removed;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(arr[i]);
            i++;
            i %= arr.length;
        }while (i != end);
    }
}
