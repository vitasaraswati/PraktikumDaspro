public class CobaArgs29 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hai, Selamat Datang");
        }
        if (args.length > 0) {
            System.out.println("Hai " + args[0]);
            System.out.println("Selamat Datang di " + args[1]);
        }
    }
}