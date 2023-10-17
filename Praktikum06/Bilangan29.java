import java.util.Scanner;

public class Bilangan29 {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
    
        int bil1, bil2, bil3, bilanganmaks;
        bil1 = 28;
        bil2 = 54;
        bil3 = 15;

         if (bil1>bil2 && bil1>bil3) {
            bilanganmaks = bil1;
        } else if (bil2>bil1 && bil2>bil3){
            bilanganmaks = bil2;
        } else{
            bilanganmaks = bil3;
        }
        System.out.println("Nilai terbesar adalah = " +bilanganmaks);
    }
}