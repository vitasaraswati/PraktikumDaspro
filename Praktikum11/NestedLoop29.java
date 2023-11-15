import java.util.Scanner;

public class NestedLoop29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in); 
    
    System.out.print("Masukkan jumlah kota : ");
    int jumlahKota = sc.nextInt ();

    System.out.print("Masukkan suhu dalam kota : ");
    int jumlahSuhu = sc.nextInt ();

    double [][]suhu = new double [jumlahKota][jumlahSuhu];

        for (int i = 0; i < suhu.length; i++){
            System.out.println("KOTA KE-" + (i+1));

            for (int j = 0; j < suhu[i].length; j++){
            System.out.print(" Suhu ke-" + (j+1) + ": ");
            suhu[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < suhu.length; i++){
                System.out.printf("KOTA KE-" + (i+1) + ": ");

                double totalSuhu = 0;
                
                for (double temp : suhu[i]){
                System.out.print(temp + " ");
                totalSuhu += temp;
                }   

                double RataRata = totalSuhu / suhu[i].length;
                System.out.println("\nRata - Rata suhu di kota ke-" + (i+1) + ": " + RataRata);
                
                System.out.println();
        }
    }
}
