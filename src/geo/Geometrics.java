package geo;
public class Geometrics {

    static double getArea(double x, double y) {
        return x * y;
    }

    static double getPerimeter(double x, double y) {
        return x + y;
    }

    static double getSphere(double x, double y, double z) {
        return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }

    static double getCylinder(double z) {
        return (Math.PI * Math.pow(z, 3) / 6);
    }

    static double getUngula(double x, double z) {
        return (2 * x * z) / 3;
    }

    static void areaMsg(double result) {
        System.out.println("x * y = " + result);
    }

    static void perimeterMsg(double result) {
        System.out.println("x + y = " + result);
    }
    public static void main(String[] args) {
        // area ... Fläche
        System.out.println("Square area");
        for (int i = 1; i < 5; i++) {
            areaMsg(getArea(Math.random(), Math.random()));
        }

        // perimeter ... Umfang
        System.out.println("Square perimeter");
        for (int i = 1; i < 5; i++) {
            perimeterMsg(getPerimeter(Math.random(), Math.random()));
        }

        System.out.println("Rectangle area");
        for (int i = 1; i < 5; i++) {
            areaMsg(getArea(Math.random(), Math.random()));
        }

        System.out.println("Rectangle perimeter");
        for (int i = 1; i < 5; i++) {
            perimeterMsg(getPerimeter(Math.random(), Math.random()));
        }

        System.out.println("We can also calculate some volumes");
        /*
            z is our height
            y is our radius
         */
        System.out.println("Zone of a sphere");
        System.out.println(getSphere(Math.random(), Math.random(), Math.random()));

        System.out.println("Sphere with cylinder");
        System.out.println(getCylinder(Math.random()));

        System.out.println("Ungula");
        System.out.println(getUngula(Math.random(), Math.random()));
    }
}
