package designpatterns.example.factory;

import designpatterns.example.factory.shapes.Shape;

public class ShapeFactory {

    public static Shape getShape(Class< ? extends Shape> shapeType) throws IllegalAccessException, InstantiationException {
        return shapeType.newInstance();
    }
}
