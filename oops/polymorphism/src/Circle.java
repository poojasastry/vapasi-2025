class Circle extends Shape{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        System.out.println("Area of circle is: ");
        return Math.PI*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Perimeter of circle is: ");
        return 2*Math.PI*radius;
    }
}

