package designpatterns.example.factory.shapes;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}