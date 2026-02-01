class pra13 {
    double width;
    double height;

    pra13(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
	System.out.println("\nTanwani Komal, 250393107015");
        pra13 r1 = new pra13(4, 40);
        pra13 r2 = new pra13(3.5, 35.9);

        System.out.println("pra13 1:");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println();

        System.out.println("pra13 2:");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        System.out.println();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
           
        }
    }
}
