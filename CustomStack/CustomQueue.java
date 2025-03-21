package CustomStack;

public class CustomQueue  extends Exception{

    int end = 0;
    int[] arr;
    public static final int DEFAULT_SIZE = 4;

    CustomQueue(){
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size){
        this.arr = new int[size];
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        arr[end++] = item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from a empty queue");
        }
        int removed = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return arr[0];
    }

    public void display() throws Exception{
        for(int i = 0; i < end; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return end == arr.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

}
