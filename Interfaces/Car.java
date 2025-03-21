package Interfaces;

public class Car implements Engine, Brakes{

    @Override
    public void brake() {
        System.out.println("I breake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("Start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate like a normal car");
    }
}
