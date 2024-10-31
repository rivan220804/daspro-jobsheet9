import java.util.Scanner;
/**
 * Tugas3_23
 */
public class Tugas3_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
        System.out.println("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println(makananDicari + " tersedia di menu.");
        } else {
            System.out.println(makananDicari + " tidak ada di menu.");
        }
    }
}
