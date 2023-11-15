import java.util.Scanner;

public class Star29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.print("Masukkan jumlah * : ");
    int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("*");
        }
    }
}