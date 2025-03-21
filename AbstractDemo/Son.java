package AbstractDemo;

public class Son extends Parent {
    Son(int aage) {
        super(aage);
    }

    @Override
    void hello() {
        super.hello();
    }

    @Override
    void career(String name) {
        System.out.println("I am a: "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("She is "+name + " And her age is: "+age);
    }


}
