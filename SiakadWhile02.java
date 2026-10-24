import java.util.Scanner;

public class SiakadWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid, input ulang!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
    System.out.println("Nilai huruf: A");
    System.out.println("Bagus, pertahankan nilainya");
} else if (nilai > 73) {
                System.out.println("Nilai B+");
            } else if (nilai > 65) {
                System.out.println("Nilai B");
            } else if (nilai > 60) {
                System.out.println("Nilai C+");
            } else if (nilai > 50) {
                System.out.println("Nilai C");
            } else if (nilai > 39) {
                System.out.println("Nilai D");
            } else {
                System.out.println("Nilai E");
            }

            i++;
        }

        sc.close();
    }
}