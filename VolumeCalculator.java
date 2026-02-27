class VolumeCalculator {

    void calculateVolume(int side) {
        int volume = side * side * side;
        System.out.println("Volume of Cube: " + volume);
    }

    void calculateVolume(int length, int width, int height) {
        int volume = length * width * height;
        System.out.println("Volume of Rectangular Cube: " + volume);
    }

    void calculateVolume(double radius) {
        double volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;
        System.out.println("Volume of Sphere: " + volume);
    }

    public static void main(String[] args) {
        System.out.println("Komal Tanwani, 250393107015");

        VolumeCalculator v = new VolumeCalculator();

        v.calculateVolume(5);
        v.calculateVolume(4, 6, 8);
        v.calculateVolume(3.5);
    }
}