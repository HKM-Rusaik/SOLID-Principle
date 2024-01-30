package singleresponsibility;

class Rectangle implements Shape{
    int width;
    int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return width*height;
    }
}
