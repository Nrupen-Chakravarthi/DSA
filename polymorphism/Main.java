package polymorphism;

import Inheritance.Box;

public class Main extends Box{
    public static void main(String[] args) {
        Object o;
        shapes s1 = new Circle();
        s1.area();
        Main main = new Main();
        System.out.println(main.name);
    }
}
