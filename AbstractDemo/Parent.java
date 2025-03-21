package AbstractDemo;

 abstract public class Parent {

     int age;
     final int value;


     Parent(int age){
         this.age = age;
         value = 100;
     }

     void hello(){
         System.out.println("Hello");
     }




    abstract void career(String name);
    abstract void partner(String name, int age);
}
