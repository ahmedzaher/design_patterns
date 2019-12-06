package designpatterns.example.factory;

import designpatterns.example.factory.shapes.Circle;
import designpatterns.example.factory.shapes.Rectangle;
import designpatterns.example.factory.shapes.Shape;
import designpatterns.example.factory.shapes.Square;

public class Demo {
    public static void main(String args[]) throws InstantiationException, IllegalAccessException {
        Shape circle = ShapeFactory.getShape(Circle.class);
        Shape square = ShapeFactory.getShape(Square.class);
        Shape rectangle = ShapeFactory.getShape(Rectangle.class);
  //      Shape rectangle2 = ShapeFactory.getShape(Shape.class);

        circle.draw();
        square.draw();
        rectangle.draw();
  //      rectangle2.draw();
    }
}

