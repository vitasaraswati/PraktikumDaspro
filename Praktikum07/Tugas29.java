import java.util.Scanner;
public class Tugas29 {
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);

    String username = "kasir1";
    String password = "kasirbaru23";
    int maxTries = 3;
    int tries = 0;

    while (tries < maxTries) {
        System. out.print("Username : ");
        String inputUsername = sc.next();
        System.out.print("Password :");
        String inputPassword = sc.next();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                tries++;
                System.out.println("Login gagal. Sisa percobaan: " + (maxTries - tries));
            }
        }

        if (tries == maxTries) {
            System.out.println("Anda telah melebihi batas percobaan login.");
        }
    }
}
    
