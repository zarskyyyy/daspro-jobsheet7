import java.util.Scanner;

public class KafeDoWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga;

        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (atau batal): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dihentikan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = Integer.parseInt(sc.nextLine());

            System.out.print("Jumlah teh: ");
            teh = Integer.parseInt(sc.nextLine());

            System.out.print("Jumlah roti: ");
            roti = Integer.parseInt(sc.nextLine());

            totalHarga = (kopi * hargaKopi)
                       + (teh * hargaTeh)
                       + (roti * hargaRoti);

            System.out.println("Nama pelanggan: " + namaPelanggan);
            System.out.println("Total harga: Rp" + totalHarga);

        } while (true);

        sc.close();
    }
}