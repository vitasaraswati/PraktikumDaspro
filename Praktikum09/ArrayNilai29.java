import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int [] nilaiAkhir = new int [10];
    int nilaiMaksimum = nilaiAkhir [0];
    int nilaiMinimum = nilaiAkhir [0];
    int jumlahLulus = 0;
    int jumlahTidakLulus = 0;
    float nilaiRataRata, total = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir [i] = sc.nextInt ();
            total = total + nilaiAkhir [i];

            if (nilaiAkhir[i] > nilaiMaksimum) {
                nilaiMaksimum = nilaiAkhir [i]; 
            }
        }
            nilaiMinimum= nilaiAkhir [0];
            for (int i = 0; i < nilaiAkhir.length; i++){
                if (nilaiAkhir[i] < nilaiMinimum){
                    nilaiMinimum = nilaiAkhir [i];
                }
            }

    // penentuan lulus/tidak lulus    
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir [i] > 70) {
            } else {
            }
        }
    
        // Penentuan lulus/tidak lulus dan menghitung jumlahnya
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Nilai akhir mahasiswa ke-" + (i + 1) + " lulus");
                jumlahLulus++; // Menambah jumlah lulus
            } else {
                System.out.println("Nilai akhir mahasiswa ke-" + (i + 1) + " tidak lulus");
                jumlahTidakLulus++; // Menambah jumlah tidak lulus
            }
        }

        nilaiRataRata = total / 10;
        System.out.println("Nilai Rata - Rata adalah : " + nilaiRataRata);

        System.out.println("Nilai Maksimum: " + nilaiMaksimum);
        System.out.println("Nilai Minimum : " + nilaiMinimum);

    // output jumlah lulus/tidak lulus
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswayang tidak lulus: " + jumlahTidakLulus);
        
    }
 }