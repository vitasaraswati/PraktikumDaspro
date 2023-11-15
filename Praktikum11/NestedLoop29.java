import java.util.Scanner;

public class NestedLoop29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in); 
    
    double [][]suhu = new double [2][4];

        for (int i = 0; i < suhu.length; i++){
            System.out.println("KOTA KE-" + (i+1));

            for (int j = 0; j < suhu[i].length; j++){
            System.out.print(" Suhu ke-" + (j+1) + ": ");
            suhu[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < suhu.length; i++){
                System.out.println("KOTA KE-" + (i+1) + ": ");
                
                for (int j = 0; j < suhu[i].length; j++){
                System.out.print(suhu[i][j] + " ");
                }   

                System.out.println();
        }
    }
}
