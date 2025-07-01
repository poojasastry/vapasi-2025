class Rectangle extends Shape{
    int length,width;

    Rectangle(){

    }

    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea(){
        System.out.println("Area of rectangle is: ");
        return length*width;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Perimeter of rectangle is: ");
        return 2*(length+width);
    }

    void setDimensions(int length, int width){
        System.out.println("Area of rectangle with two arguments is: " + length*width);
    }

    void setDimensions(int length){
        System.out.println("Area of a square, with one argument is: " + length*length);
    }
}
