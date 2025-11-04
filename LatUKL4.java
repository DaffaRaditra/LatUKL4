import java.util.Scanner;

public class LatUKL4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menghitung Volume Tabung");
        
        System.out.print("Masukkan jari-jari tabung (r): ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung (t): ");
        double tinggi = scanner.nextDouble();

        double volume = hitungVolumeTabung(jariJari, tinggi);

        System.out.printf("\nVolume tabung adalah: *%.2f*\n", volume);

    }

    public static double hitungVolumeTabung(double r, double t) {
        double phi = Math.PI; 
        double volume = phi * r * r * t;
        return volume;
    }
}