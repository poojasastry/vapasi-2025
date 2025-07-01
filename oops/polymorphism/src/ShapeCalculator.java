import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Showing Run-time polymorphism:");
        ArrayList<Shape> shapesList = new ArrayList<Shape>();
        shapesList.add(new Circle(5));
        shapesList.add(new Rectangle(2,4));
        shapesList.add(new Triangle(10,5));
        for (Shape shapeType : shapesList) {
            System.out.println(shapeType.calculateArea());
            System.out.println(shapeType.calculatePerimeter());
        }

        System.out.println("Showing Compile-time polymorphism:");
        Rectangle r = new Rectangle();
        r.setDimensions(3,5);
        r.setDimensions(5);
    }
}