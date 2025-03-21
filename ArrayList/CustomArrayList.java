package ArrayList;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private int size = 0;
    private static int DEFAULT_SIZE = 5;

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public boolean isFull(){
        return data.length == size;
    }
    public void resize(){
        int[] temp = new int[data.length * 2];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, int num){
         data[index] = num;
    }

    public void add(int n){
         if(isFull()){
             resize();
         }
         data[size++] = n;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {

    }
}
