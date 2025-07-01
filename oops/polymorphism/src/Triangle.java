class Triangle extends Shape{
    int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        System.out.println("Area of triangle is: ");
        return (double) (base * height) /2;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Perimeter of triangle is: ");
        double hypotenuse = Math.sqrt((base*base)+(height*height));
        return base + height + hypotenuse;
    }
}
