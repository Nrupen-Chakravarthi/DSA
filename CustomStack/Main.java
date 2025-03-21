package CustomStack;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new DynamicStack(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(8);



        stack.display();
    }
}
