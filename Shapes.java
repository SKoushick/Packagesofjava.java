package Polymorphism;

public class Shapes {
    int a = 100;

    void area() {
        System.out.println("this is Shapes block");
    }

}

interface I1 {
    abstract void b();

    static void sum() {
        System.err.println("this is static block where the interface is implemented");
    }
}

interface I2 {
    abstract void a();
}
