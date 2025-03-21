package CustomStack;

import java.util.Arrays;

public class CustomStack {
    int[] arr;
    public static final int DEFAULT_SIZE = 5;
    int ptr = -1;

    CustomStack(){
        this(DEFAULT_SIZE);
    }
    CustomStack(int size){
        this.arr = new int[size];
    }

    public boolean isFull(){
        return ptr == arr.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }


    public boolean push(int data){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        arr[++ptr] = data;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        return arr[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peek for an empty stack");
        }
        return arr[ptr];
    }
    public void display(){
        for(int i : arr){
            if(isEmpty()){
                break;
            }
            System.out.println(arr[ptr--]);
        }
    }
}
