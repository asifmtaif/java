package task1;

public class rectangle {
    float length;
    float width;

    void perimeter() {
        System.out.println("Perimeter: " + 2 * (length + width));
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        // Create rectangle objects
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();

        r1.length = 4;
        r1.width = 2;
        r2.length = 36;
        r2.width = 20;

        r1.area();
        r1.perimeter();
        r2.area();
        r2.perimeter();
    }
}
