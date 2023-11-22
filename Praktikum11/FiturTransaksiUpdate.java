import java.util.Scanner;

public class FiturTransaksiUpdate {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
 
// Instansiasi dan deklarasi array nama roti 
    String namaRoti[] = new String[10], namaHistory[] = new String[10];
    //inisialisasi harga roti
    namaRoti[0] = "Roti Abon";
    namaRoti[1] = "Roti Pizza";
    namaRoti[2] = "Roti Moy";
    namaRoti[3] = "Roti Sosis";
    namaRoti[4] = "Milky Cheese";

// intansiasi dan deklarasi array harga roti
    double hargaRoti[] = new double[10], hargaRotiHistory[] = new double[10];
    // Inisialisasi Harga Roti
    hargaRoti[0] = 7500;
    hargaRoti[1] = 6500;
    hargaRoti[2] = 7000;
    hargaRoti[3] = 7000;
    hargaRoti[4] = 6000;

// Intstansiasi dan deklarasi array stock
    int stockRoti[] = new int[10], kodeRotiHistory[] = new int[10], kuantitasRotiHistory[] = new int[10];
    //inisialisasi harga stock
    stockRoti[0] = 10;
    stockRoti[1] = 5;
    stockRoti[2] = 15;
    stockRoti[3] = 13;
    stockRoti[4] = 8;

// deklarasi 
    int totalHarga = 0;
    boolean isMember = false;
    char keluar;

    System.out.println();
    System.out.println("Daftar Harga Roti");

// Tampilan data roti 
        System.out.printf("---------------------------------------------------%n");
        System.out.printf("| %-5s | %-18s | %-10s | %5s |%n", "KODE", "NAMA ROTI", "HARGA", "STOK");
        System.out.printf("---------------------------------------------------%n");

            for (int i = 0; i < namaRoti.length; i++) {
                System.out.printf("| %-5s | %-18s | %-10s | %5d |%n", (i + 1), namaRoti[i], hargaRoti[i], stockRoti[i]);
            }

            System.out.printf("---------------------------------------------------%n");

            System.out.println(" ");        
        
// Transaksi pembelian 
            do {
                System.out.print("Masukkan Kode Roti yang dibeli : ");
                int kodeRoti = sc.nextInt();

                System.out.print("Masukkan Banyak Roti yang dibeli : ");
                int jumlahRoti = sc.nextInt();

            // rumus hitung sisa stok roti
                stockRoti[kodeRoti] -= jumlahRoti;

            // rumus hitung totoal harga barang dibeli
                totalHarga += hargaRoti[kodeRoti] * jumlahRoti;

                System.out.print("Tambah Roti ? (y/t) : ");
                char tambahRoti = sc.next().charAt(0);

                    if (tambahRoti == 't') {
                    break;
                    }
            } while (true);       

// Diskon membership loyalty
        System.out.print("Apakah pembeli memiliki membership ? (y/t) : ");
        char membership = sc.next().charAt(0);

                if (membership == 'y') { 
                    totalHarga *= 0.5; // jika ya diskon 5%
                }

// output total haraga
        System.out.println("\nTotal Harga : " + totalHarga);

        System.out.print("Masukkan Pembayaran Pembeli : ");
        int pembayaranPembeli = sc.nextInt();

        int kembalian = pembayaranPembeli - totalHarga;

// Output kembalian
        System.out.println("Kembalian : " + kembalian);

// Menampilkan sisa stok roti setelah transaksi dengan
        System.out.println("\n** Sisa stock roti : ** ");
            for (int i = 0; i < namaRoti.length; i++) {
                System.out.println("Kode : " + i + "\t" + namaRoti[i] + "\t\tStock Sisa: " + stockRoti[i]); 
            }

        System.out.println(" ");
    }
}