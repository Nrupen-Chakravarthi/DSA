public class ObjectClass {
    int num;
    String name;

    public ObjectClass() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public ObjectClass(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public static void main(String[] args) {
        ObjectClass objectClass = new ObjectClass(1,"Nrupen");
        ObjectClass objectClass1 = objectClass;

        if(objectClass.equals(objectClass1)){
            System.out.println(objectClass1.hashCode());
            System.out.println(objectClass.hashCode());
        }

    }
}
