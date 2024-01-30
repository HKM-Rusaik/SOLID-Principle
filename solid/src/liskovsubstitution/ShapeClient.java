package liskovsubstitution;

// Client code using shapes without knowing the specific implementations
public class ShapeClient {
    public static void printAreaAndPerimeter(TwoDimensionalShape shape) {
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }

    public static void printAreaAndVolume(ThreeDimensionalShape shape) {
        System.out.println("Area: " + shape.area());
        System.out.println("Volume: " + shape.volume());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Sphere sphere = new Sphere(3);

        printAreaAndPerimeter(circle);
        printAreaAndPerimeter(square);

        printAreaAndVolume(sphere);
    }
}

