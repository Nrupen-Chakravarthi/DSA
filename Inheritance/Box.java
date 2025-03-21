package Inheritance;

public class Box {
    protected String name = "Nrupen";
    double l;
     double w;
    double h;

    public Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    public Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}

