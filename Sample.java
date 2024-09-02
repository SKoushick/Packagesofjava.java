package Polymorphism;

import Polymorphism.*;

public class Sample implements I1, I2 {
    public static void main(String[] args) {
        System.out.println("Interface has been initialized");
        Sample obj = new Sample();
        obj.a();
        obj.b();
    }

    @Override
    public void b() {
        System.err.println("this is B block in interface");
    }

    @Override
    public void a() {
        System.err.println("this is abstract class included");
    }

}