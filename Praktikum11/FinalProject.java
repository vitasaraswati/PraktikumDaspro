import java.util.Scanner;
public class FinalProject {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Login dengan Multi User

        System.out.println("===== LOGIN USER =====");
        String username[] = {"Sufyan", "Raihan", "Vita"};
        String password[] = {"Bagaskara", "Abdi", "Ativ"};
        String[] posisi = {"Owner","Admin","Kasir"};

        String usernameLogin, passwordLogin;
        char login = 'n';
        
        while (true) {
            System.out.print("Username: ");
            usernameLogin = sc.nextLine();
            System.out.print("Password: ");
            passwordLogin = sc.nextLine();

            System.out.println();

            for (int i = 0; i < username.length; i++) {
                if (usernameLogin.equals(username[i]) && passwordLogin.equals(password[i])) {
                    System.out.println("Selamat Datang Kembali " + username[i]);
                    System.out.println("Anda Masuk Sebagai " + posisi[i]);
                    login = 'y';
                    break;
                // } else {
                //     System.out.println("Maaf Username atau Password anda Salah");
                //     break;
                }
            }

            System.out.println();

            if (login == 'y') {
                break;
            }
        }

        // Menu

        int menu;

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Transaksi");
            System.out.println("2. Data Roti");
            System.out.println("3. Laporan Pendapatan");
            System.out.println("4. Logout");

            System.out.println();
    
            System.out.print("Masukkan Menu yang ingin dipilih (1-4) : ");
            menu = sc.nextInt();

            System.out.println();

            //Global Variable

            String namaRoti[] = new String[10], namaHistory[] = new String[10];
            double hargaRoti[] = new double[10], hargaRotiHistory[] = new double[10];
            int stockRoti[] = new int[10], kodeRotiHistory[] = new int[10], kuantitasRotiHistory[] = new int[10];
            char keluar;
            
            // Inisialisasi Nama Roti

            namaRoti[0] = "Roti Abon";
            namaRoti[1] = "Roti Pizza";
            namaRoti[2] = "Roti Moy";
            namaRoti[3] = "Roti Sosis";
            namaRoti[4] = "Milky Cheese";

            // {"Roti Abon", "Roti Pizza", "Roti Moy", "Roti Sosis", "Roti Mily Cheese"}
            
            // Inisialisasi Harga Roti

            hargaRoti[0] = 7500;
            hargaRoti[1] = 6500;
            hargaRoti[2] = 7000;
            hargaRoti[3] = 7000;
            hargaRoti[4] = 6000;
            
            // {7500, 6500, 7000, 7000, 6000}

            // Inisialisasi Stock Roti

            stockRoti[0] = 10;
            stockRoti[1] = 5;
            stockRoti[2] = 15;
            stockRoti[3] = 13;
            stockRoti[4] = 8;

            // {10, 5, 15, 13, 8}

            // Variable Sementara

            int sementara = 5, namaRotiSementara = 5, hargaRotiSementara = 5, stockRotiSementara = 5;

            // Variable History
            int history = 0, historyInner = 0;
    
            // Transaksi

            if (menu == 1) {
                while (true) {
                    String namaHistoryInner[] = new String[10];
                    double hargaRotiHistoryInner[] = new double[10];
                    int kodeRotiHistoryInner[] = new int[10], kuantitasRotiHistoryInner[] = new int[10];


                    int kodeRoti = 0, kuantitasRoti = 0;
                    double totalHarga = 0, totalHargaDiskon = 0, uangPembeli = 0, kembalian = 0 , diskon = 0;
                    char tambahRoti, membership;

                    System.out.printf("---------------------------------------------------%n");
                    System.out.printf("| %-5s | %-18s | %-10s | %5s |%n", "KODE", "NAMA ROTI", "HARGA", "STOCK");
                    System.out.printf("---------------------------------------------------%n");

                    for (int i = 0; i < sementara; i++) {
                        System.out.printf("| %-5s | %-18s | %-10s | %05d |%n", (i + 1), namaRoti[i], hargaRoti[i], stockRoti[i]);
                    }

                    System.out.printf("---------------------------------------------------%n");

                    System.out.println();

                    while (true) {
                        System.out.print("Kode Roti: ");
                        kodeRoti = sc.nextInt();
                        System.out.print("Kuantitas Roti: ");
                        kuantitasRoti = sc.nextInt();


                        // Pengurangan Stock
                        stockRoti[kodeRoti-1] -= kuantitasRoti;

                        // history function
                    
                        // kodeRotiHistoryInner[historyInner] = (kodeRoti - 1);
                        // namaHistoryInner[historyInner] = namaRoti[kodeRoti-1];
                        // kuantitasRotiHistoryInner[historyInner] = kuantitasRoti;
                        // hargaRotiHistoryInner[historyInner] = hargaRoti[kodeRoti-1];

                        kodeRotiHistory[history] = (kodeRoti - 1);
                        namaHistory[history] = namaRoti[kodeRoti-1];
                        kuantitasRotiHistory[history] = kuantitasRoti;
                        hargaRotiHistory[history] = hargaRoti[kodeRoti-1];

                        // System.out.println(kodeRotiHistoryInner[historyInner]);
                        // System.out.println(kodeRotiHistory[history]);

                        historyInner++;

                        totalHarga = totalHarga + (hargaRoti[kodeRoti-1] * kuantitasRoti);

                        while (true) {
                            System.out.print("Tambah Roti ? (y/t) : ");
                            tambahRoti = sc.next().charAt(0);
                            if (tambahRoti == 'y') {
                                break;
                            } else if (tambahRoti == 't') {
                                break;
                            } else {
                                System.out.println("Input Salah, Masukkan Lagi!");
                            }
                        }

                        System.out.println();

                        if (tambahRoti == 'y') {
                            continue;
                        } else if (tambahRoti == 't') {
                            break;
                        }

                    }

                    System.out.print("Punya Member ? (y/t) : ");
                    membership = sc.next().charAt(0);

                    System.out.println();

                    if (membership == 'y') {
                        if (totalHarga > 50000 && totalHarga < 100000) {
                            diskon = 0.10;
                        } else if (totalHarga > 100000) {
                            diskon = 0.15;
                        }
                    } else if (membership == 't') {
                        if (totalHarga > 50000 && totalHarga < 100000) {
                            diskon = 0.05;
                        } else if (totalHarga > 100000) {
                            diskon = 0.10;
                        }
                    }

                    totalHargaDiskon = totalHarga - (totalHarga * diskon);
                    System.out.println("Total Harga : " + totalHarga);
                    System.out.println("Total Harga Setelah Diskon : " + totalHargaDiskon);

                    System.out.println();

                    while (true) {
                        System.out.print("Uang Pembeli : ");
                        uangPembeli = sc.nextDouble();
                        System.out.println(uangPembeli);
                        if (uangPembeli > totalHargaDiskon) {
                            break;
                        } else {
                            System.out.println("Uang Kurang dari Total Harga, Masukkan Lagi!");
                        }
                    }

                    kembalian = uangPembeli - totalHargaDiskon;
                    System.out.println("Kembalian : " + kembalian);

                    System.out.println();

                    System.out.print("Transaksi Baru ? (y/t) : ");
                    keluar = sc.next().charAt(0);

                    // kodeRotiHistory[history] = kodeRotiHistoryInner[historyInner];
                    // namaHistory[history] = namaHistoryInner[historyInner];
                    // kuantitasRotiHistory[history] = kuantitasRotiHistoryInner[historyInner];
                    // hargaRotiHistory[history] = hargaRotiHistoryInner[historyInner];
                    
                    history++;

                    System.out.println();

                    if (keluar == 'y') {
                        continue;
                    } else if (keluar == 't') {
                        break;
                    }
                }
            }

            // Data Roti
            
            else if (menu == 2) {
                while (true) {
                    System.out.printf("---------------------------------------------------%n");
                    System.out.printf("| %-5s | %-18s | %-10s | %5s |%n", "KODE", "NAMA ROTI", "HARGA", "STOCK");
                    System.out.printf("---------------------------------------------------%n");
    
                    for (int i = 0; i < sementara; i++) {
                        System.out.printf("| %-5s | %-18s | %-10s | %05d |%n", (i + 1), namaRoti[i], hargaRoti[i], stockRoti[i]);
                    }
    
                    System.out.printf("---------------------------------------------------%n");
    
                    System.out.println();

                    System.out.println("===== MENU DATA =====");
                    System.out.println("1. Tambah Roti Baru");
                    System.out.println("2. Update Stock Roti");
                    System.out.println("3. Kembali Ke Menu Awal");

                    System.out.println();
    
                    int menuData;
    
                    System.out.print("Masukkan Menu yang ingin dipilih (1-3) : ");
                    menuData = sc.nextInt();
    
                    if (menuData == 1) {
                            String namaRotiBaru;
                            double hargaRotiBaru;
                            int stockRotiBaru;

                            sc.nextLine();
    
                            System.out.print("Nama Roti : ");
                            namaRotiBaru = sc.nextLine();
                            namaRoti[namaRotiSementara] = namaRotiBaru;
                            namaRotiSementara++;
    
                            System.out.print("Harga Roti : ");
                            hargaRotiBaru = sc.nextDouble();
                            hargaRoti[hargaRotiSementara] = hargaRotiBaru;
                            hargaRotiSementara++;

                            System.out.print("Stock Roti : ");
                            stockRotiBaru = sc.nextInt();
                            stockRoti[stockRotiSementara] = stockRotiBaru;
                            stockRotiSementara++;

                            System.out.println();

                            System.out.println("Penambahan Roti Baru Berhasil");
                            sementara++;
                            
                            System.out.println();
                    } else if (menuData == 2) {
                        int kodeRotiUpdate = 0, stockRotiUpdate = 0;
                        System.out.print("Kode Roti : ");
                        kodeRotiUpdate = sc.nextInt();
                        System.out.print("Stock Roti : ");
                        stockRotiUpdate = sc.nextInt();

                        stockRoti[kodeRotiUpdate-1] = stockRotiUpdate;
                        System.out.println();
                    } else if (menuData == 3) {
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Menu Tidak Tersedia, Masukkan Lagi");
                        System.out.println();
                    }
                }
            }

            // Laporan Pendapatan

            else if (menu == 3) {
                for (int i = 0; i < sementara; i++) {
                    System.out.printf("| %-5s | %-18s | %-5s | %-5s |%n", kodeRotiHistory[i], namaHistory[i], kuantitasRotiHistory[i], hargaRotiHistory[i]);
                }
            }

            // Moleh Sek Bolo
            
            else if (menu == 4) {

            } 
            
            // Seng nggenah lek ngelebokno angka, ojok kyk wong ndelosor ae
            
            else {
                System.out.println("Maaf Menu Tidak Tersedia, Silahkan Masukkan Angka Menu Yang Benar!");
            }
        }
    }
}
