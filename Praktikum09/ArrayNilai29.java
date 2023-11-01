import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int [] nilaiAkhir = new int [10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir [i] = sc.nextInt ();
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) +  " lulus ");
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus ");
            }
        }
    }
}