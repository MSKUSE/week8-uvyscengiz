public class Shape {
    private String color = "white";

    public Shape() {}
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        return 0.0;
    }

    public double perimeter() {
        return 0.0;
    }

    public void describe(int a, int b) {
        System.out.println("Side a = " + a);
        System.out.println("Side b = " + b);
    }
    public void describe(int a) {
        System.out.println("Side a = " + a);
        System.out.println("Side b = " + a);
    }
    public void describe(double r) {
        System.out.println("Radius = " + r);
    }
}