import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaDira = (int)(Math.random() * 100) + 1;
        int tebakan = 0;
        do {
            System.out.println("Masukkan tebakan Anda:");
            tebakan = scanner.nextInt();
            if (tebakan > angkaDira) {
                System.out.println("Terlalu tinggi!");
            } else if (tebakan < angkaDira) {
                System.out.println("Terlalu rendah!");
            }
        } while (tebakan != angkaDira);
        System.out.println("Selamat! Anda berhasil menebak angka yang dipikirkan Dira.");
    }
}
