package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        square.area();
        System.out.println(shape.a);
    }
}
