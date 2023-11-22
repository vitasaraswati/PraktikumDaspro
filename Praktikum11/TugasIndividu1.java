import java.util.Scanner; 

public class TugasIndividu1 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);

    System.out.print("Masukkan nilai n : ");
    int n = sc.nextInt();

        if (n > 2){ 
                for (int i = 1; i <= n; i++){

                    for (int j = 1; j <= n -i; j++){
                        System.out.print(" ");
                    }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(k);
                        }

                        System.out.println();
                }

        } else {
                        System.out.println("Nilai n harus lebih dari 2");
        }
    }
}
            