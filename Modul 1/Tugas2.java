import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLogin = true;

        while (continueLogin) {
            System.out.println("Pilih Jenis Login:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1/2/3): ");
            
            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka 1, 2, atau 3.");
                scanner.nextLine(); 
                continue; 
            }

            switch (choice) {
                case 1:
                    loginAdmin(scanner);
                    break;
                case 2:
                    loginMahasiswa(scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    continueLogin = false; 
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    private static void loginAdmin(Scanner scanner) {
        System.out.print("Masukkan Username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        if (username.equals("Admin231") && password.equals("Password231")) {
            System.out.println("Login Admin berhasil!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    private static void loginMahasiswa(Scanner scanner) {
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        if (name.equals("Muhammad Iqbal Habibi") && nim.equals("202410370110231")) {
            System.out.println("Login Mahasiswa berhasil!");
            System.out.println("Nama: " + name);
            System.out.println("NIM: " + nim);
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }
}