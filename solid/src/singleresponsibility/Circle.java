package singleresponsibility;

class Circle implements Shape{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public int area() {
        return 3*(radius * radius);
    }
}
