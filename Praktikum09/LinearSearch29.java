import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch29 {
    public static void main(String[] args) {

        // Input scanner dan Array List
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> indeksSama = new ArrayList<>();

        // Masukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = sc.nextInt();
        
        // Input elemen array sejumlah banyaknya elemen yang diinginkan
        int[] arrayInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();
        }
        
        // input key yang ingin dicari 
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1; 


        // perulangan menentukan array list
        for (int i = 0; i < arrayInt.length; i++) {
                if (arrayInt[i] == key) {
                    indeksSama.add(i);
                }   
        }

        // pemilihan key ditemukan / tidak ditemukan
        if (indeksSama.isEmpty()) {
                System.out.println("Key " + key + " tidak ditemukan.");
        } else {
                System.out.print("Key " + key + " ditemukan dalam array pada posisi indeks ke-");
                    for (int i = 0; i < indeksSama.size(); i++) {
                    System.out.print(indeksSama.get(i));
                        if (i < indeksSama.size() - 1) {
                        System.out.print(", ");
                }
            }
        }
    }
}
