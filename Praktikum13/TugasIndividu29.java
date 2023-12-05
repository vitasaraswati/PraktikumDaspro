import java.util.Scanner;

public class TugasIndividu29 {
    static Scanner sc = new Scanner(System.in);
    static int[][] nilai = new int[5][7];
    static String[] nama = { "Sari", "Rina", "Yani", "Budi", "Ali" };

    public static void main(String[] args) {
        inputnilai();
        System.out.println(" ");
        tampilnilai();
        System.out.println(" ");
        hari();
        System.out.println(" ");
        mahasiswa();
    }

    public static void inputnilai() {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Masukkan nilai " + nama[i] + " minggu ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilnilai() {
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i] + " : "); // Nama orang
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j]);
                if (j < nilai[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void hari() {
        int maxValue = nilaitertinggi(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == maxValue) {
                    System.out.println("Nilai tertinggi ada pada minggu ke-" + (j + 1));
                }
            }
        }
    }

    public static void mahasiswa() {
        int maxValue = nilaitertinggi(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == maxValue) {
                    System.out.println(
                            "Mahasiswa dengan nilai tertinggi adalah " + nama[i] + " dengan nilai " + maxValue);
                }
            }
        }
    }

    static int nilaitertinggi(int[][] array) {
        int maxValue = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }
}