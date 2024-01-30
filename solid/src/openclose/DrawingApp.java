package openclose;

// Client code that can use any drawable shape without modifying existing code
public class DrawingApp {
    public static void drawShape(Drawable shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(8, 10);

        drawShape(circle);    // Draws: Drawing Circle with radius 5.0
        drawShape(rectangle); // Draws: Drawing Rectangle with width 8.0 and height 10.0
    }
}