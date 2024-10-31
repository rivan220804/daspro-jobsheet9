import java.util.Scanner;
/**
 * Tugas1_23
 */
public class Tugas1_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int total = 0, nilaiTertinggi = Integer.MIN_VALUE, nilaiTerendah = Integer.MAX_VALUE;

        // Input nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            total += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] > nilaiTertinggi) nilaiTertinggi = nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] < nilaiTerendah) nilaiTerendah = nilaiMahasiswa[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / jumlahMahasiswa;

        // Menampilkan hasil
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.printf("Rata-rata nilai: %.2f\n", rataRata);
        
        sc.close();
    }
}