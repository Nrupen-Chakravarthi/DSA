package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(10);
        Daughter daughter = new Daughter(10);
        son.hello();
        System.out.println(son.value);

        son.career("Pilot");
        daughter.career("doctor");
    }
}
