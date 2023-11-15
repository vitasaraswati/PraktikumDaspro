import java.util.Scanner;
public class Triangle29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.print("Masukkan jumlah * : ");

    int i = 0;
    int n = sc.nextInt();


        while (i <= n){
            int j = 0;

            while (j < i){
                System.out.print("*");
                j++;    
            }

            i++;
            System.out.println();
        }
    }
}
