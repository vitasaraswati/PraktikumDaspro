import java.util.Scanner;

public class TugasKelompok29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("******SELAMAT DATANG DI TOKO ROTI******");

        // Mendefinisikan array 2 dimensi untuk menyimpan informasi roti
        String[][] daftarRoti = {
            {"Roti Abon", "7500"},
            {"Roti Pizza", "6500"},
            {"Roti Moy", "7000"},
            {"Roti Sosis", "7000"},
            {"Roti Milky Cheese", "6000"}
        };

        String namaRoti;
        double jumlahBarang, hargaBarang, totalHarga, totalBayar, kembalian, hargaSetelahDiskon;

        System.out.print("Masukkan nama roti yang dibeli pelanggan : ");
        namaRoti = sc.nextLine();

        hargaBarang = 0; // Inisialisasi hargaBarang dengan nilai awal nol

        // Mencari harga roti berdasarkan nama roti yang dimasukkan
        for (int i = 0; i < daftarRoti.length; i++) {
            if (namaRoti.toLowerCase().equals(daftarRoti[i][0].toLowerCase())) {
                hargaBarang = Double.parseDouble(daftarRoti[i][1]);
                break;
            }
        }

        if (hargaBarang == 0) {
            System.out.println("Roti belum terdaftar");
            return;
        }

        System.out.println("Harga roti : " + hargaBarang);
        System.out.print("Masukkan jumlah roti : ");
        jumlahBarang = sc.nextInt();

        totalHarga = hargaBarang * jumlahBarang;
        System.out.println("Total Harga yang harus dibayar : " + totalHarga);

        if (totalHarga >= 50000 && totalHarga <= 100000) {
            hargaSetelahDiskon = totalHarga - (totalHarga * 0.10);
        } else 
        if (totalHarga >= 100000 && totalHarga <= 150000) {
            hargaSetelahDiskon = totalHarga - (totalHarga * 0.20);
        } else 
        if (totalHarga > 100000) {
            hargaSetelahDiskon = totalHarga - (totalHarga * 0.30);
        } else {
            hargaSetelahDiskon = totalHarga - (totalHarga * 0.00);
        }
    
        System.out.println("Total Harga Setelah Diskon : " + hargaSetelahDiskon);
        System.out.print("Jumlah pembayaran pembeli : ");
        totalBayar = sc.nextInt();
    
        // print kembalian 
        kembalian = totalBayar - hargaSetelahDiskon;
        System.out.println("Kembalian : " +kembalian);

        System.out.println("________________________________");
        System.out.println("Terima kasih atas kunjungan Anda");
    }
}
    