package AbstractDemo;

public class Daughter extends Parent{
    Daughter(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I am a: "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("he is "+name + " And his age is: "+age);
    }
}
