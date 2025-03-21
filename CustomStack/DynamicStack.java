package CustomStack;

public class DynamicStack extends CustomStack{
    DynamicStack(){
        super();
    }

    DynamicStack(int size){
        super(size);
    }
    public void resize(){
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    @Override
    public boolean push(int data) {
        if(isFull()){
            resize();
        }
        return super.push(data);
    }
}
