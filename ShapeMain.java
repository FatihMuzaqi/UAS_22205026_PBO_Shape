
package tipedata;
import java.util.Scanner;
class Shape {

    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }
}

class Circle extends Shape {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

public class ShapeMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Perhitungan Luas Lingkaran");
        System.out.println("====================================");
        System.out.print("Masukkan warna lingkaran: ");
        String colorCircle = input.nextLine();
        System.out.print("Masukkan radius lingkaran: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(colorCircle, radius);
        System.out.println("Luas Lingkaran: " + circle.getArea());
        System.out.println("");

        // Membersihkan newline character
        input.nextLine();

        System.out.println("Perhitungan Luas Persegi Panjang");
        System.out.println("====================================");
        System.out.print("Masukkan warna persegi panjang: ");
        String colorRectangle = input.nextLine();
        System.out.print("Masukkan panjang persegi panjang: ");
        double length = input.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double width = input.nextDouble();
        Rectangle rectangle = new Rectangle(colorRectangle, length, width);
        System.out.println("Luas Persegi Panjang: " + rectangle.getArea());

        // Menutup Scanner
        input.close();
    }
}
