import java.util.Scanner;

public class ForKelipatan29 {
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);

    int bilangan;
    int total = 0;
    int counter = 0;

    System.out.print("Masukkan bilangan 1-9 : ");
    bilangan = sc.nextInt ();

        for (int i = 0; i < 50; ++i){
            if (i % bilangan == 0){
                total += i;
                ++counter;
            }
        }
    double average = (double) total / counter;
    System.out.println("Rata - Rata = " + average);
    System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
    }
}