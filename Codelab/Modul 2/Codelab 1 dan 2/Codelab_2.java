import java.util.Scanner;

class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
        System.out.println(); 
    }

    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor Uang: " + jumlah);
            System.out.println("Saldo setelah setor: " + saldo);
        } else {
            System.out.println("Jumlah setor harus positif.");
        }
        System.out.println(); 
    }

    public void tarikUang(double jumlah) {
        if (jumlah > 0) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("Tarik Uang: " + jumlah);
                System.out.println("Saldo setelah tarik: " + saldo);
            } else {
                System.out.println("Saldo tidak cukup untuk menarik uang sebesar: " + jumlah);
            }
        } else {
            System.out.println("Jumlah tarik harus positif.");
        }
        System.out.println(); 
    }
}

public class Codelab_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RekeningBank rekening1 = new RekeningBank("202410370110231", "Muhammad Iqbal Habibi", 1000000); 
        RekeningBank rekening2 = new RekeningBank("202410370110225", "Mochammad Farhan Hikmadi", 500000); 

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.print("Masukkan jumlah yang ingin disetor ke rekening 1: ");
        double setor1 = scanner.nextDouble();
        rekening1.setorUang(setor1);

        System.out.print("Masukkan jumlah yang ingin ditarik dari rekening 1: ");
        double tarik1 = scanner.nextDouble();
        rekening1.tarikUang(tarik1);

        System.out.print("Masukkan jumlah yang ingin disetor ke rekening 2: ");
        double setor2 = scanner.nextDouble();
        rekening2.setorUang(setor2);

        System.out.print("Masukkan jumlah yang ingin ditarik dari rekening 2: ");
        double tarik2 = scanner.nextDouble();
        rekening2.tarikUang(tarik2);

        System.out.println("Informasi Akhir Rekening:");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        scanner.close();
    }
}