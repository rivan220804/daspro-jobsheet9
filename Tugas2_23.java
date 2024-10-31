import java.util.Scanner;
/**
 * Tugas2_23
 */
public class Tugas2_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------SELAMAT DATANG DI RAYVEN------");
        System.out.print("Silahkan memasukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }
        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%s - %.2f\n", namaPesanan[i], hargaPesanan[i]);
        }

        System.out.printf("Total Biaya: %.2f\n", totalBiaya);
    }
}
