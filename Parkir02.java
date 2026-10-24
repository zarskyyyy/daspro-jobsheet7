import java.util.Scanner;

public class Parkir02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, jam;
        int totalBayar = 0;
        int tarif;

        while (true) {
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Selesai");

            System.out.print("Pilih jenis kendaraan: ");
            jenis = sc.nextInt();

            if (jenis ==0){
                break;
            }
            if (jenis ==1){
                tarif = 3000;
            } else if (jenis == 2) {
                tarif = 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }
            System.out.print("Masukkan lama parkir (jam): ");
            jam = sc.nextInt();

            if (jam <=0) {
                System.out.println("Lama parkir harus lebih dari 0!");
                continue;
            }
            int bayar = tarif * jam;
            totalBayar += bayar;

            System.out.println("Biaya parkir: Rp" + bayar);
        }
        System.out.println("Total pembayaran parkir: Rp" + totalBayar);

        sc.close();
    }
}