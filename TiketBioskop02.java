import java.util.Scanner;

public class TiketBioskop02 {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    int jumlahPelanggan;
    int tiket, totalTiket = 0;
    double hargaTiket = 50000;
    double totalBayar, totalPenjualan = 0;
    double diskon;

    System.out.print("MAsukkan jumlalh pelanggan: ");
    jumlahPelanggan = sc.nextInt();

    for (int i = 1; i <= jumlahPelanggan; i++) {
        System.out.print("Pelanggan ke-" + i);
        do {
            System.out.println("Masukkan jumlah tiket: ");
            tiket = sc.nextInt();

            if (tiket <0) {
                System.out.println("Jumlah tiket tidak valid!");
            }
        } while (tiket<0);
        if (tiket>10) {
            diskon = 0.15;
        } else if (tiket >4) {
            diskon = 0.10;
        } else {
            diskon = 0;
        }
        System.out.println("Diskon: " + (diskon * 100) + "%");
    }
   
    System.out.println("Total tiket terjual: " + totalTiket);
    System.out.println("Tota; penjualan: Rp" + totalPenjualan);

    sc.close();
    
}
}