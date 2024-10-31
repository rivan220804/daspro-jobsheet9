import java.util.Scanner;
/**
 * ArrayRataNilai23
 */
public class ArrayRataNilai23 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int jmlhmhs;
            int jumlahLulus = 0, jumlahTidakLulus = 0;
            double total = 0, rerataLulus, rerataTidakLulus, nilaiLulus = 0, nilaiTidakLulus = 0;
            
            System.out.print("Masukkan Jumlah Mahasiswa : ");
            jmlhmhs=sc.nextInt();
            sc.nextLine();
            
            int nilaiMhs[] = new int[jmlhmhs];
            for(int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
                nilaiMhs[i] = sc.nextInt();
            }
            for (int i = 0; i < nilaiMhs.length; i++) {
                total += nilaiMhs[i];
            }
            for (int i = 0; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > 70) {
                    jumlahLulus ++;
                    nilaiLulus += nilaiMhs[i];
                }
                else {
                    jumlahTidakLulus++;
                    nilaiTidakLulus += nilaiMhs[i];
                }
            }
            
            rerataLulus = nilaiLulus/jumlahLulus;
            rerataTidakLulus = nilaiTidakLulus/jumlahTidakLulus;
            System.out.println("Rata-rata nilai lulus = " + rerataLulus);
            System.out.println("Rata-rata nilai tidak lulus = " + rerataTidakLulus);
    
        }
    }