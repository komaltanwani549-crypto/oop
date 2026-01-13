import java.util.Scanner;

class prac1MeterToFeet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter meters: ");
        double meters = s.nextDouble(); 

        double feet = meters * 3.28084; 

        System.out.printf("Feet: %.2f", feet); 
    }
}