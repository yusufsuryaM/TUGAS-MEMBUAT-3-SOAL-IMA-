import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah nama:");
        int jumlahNama = scanner.nextInt();
        ArrayList<String> daftarNama = new ArrayList<>();

        System.out.println("Masukkan nama-nama:");
        for (int i = 0; i < jumlahNama; i++) {
            String nama = scanner.next();
            daftarNama.add(nama);
        }

        Collections.sort(daftarNama);

        System.out.println("Nama-nama dalam urutan alfabet:");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}
