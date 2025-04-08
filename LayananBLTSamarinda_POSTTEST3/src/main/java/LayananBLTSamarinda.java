import java.util.ArrayList;
import java.util.Scanner;

public class LayananBLTSamarinda {
    static ArrayList<PenerimaBantuan> daftarPenerima = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n===== Layanan Penerimaan Bantuan Langsung Tunai Pemerintah Kota Samarinda =====");
            System.out.println("|1. Tambahkan Data Penerima Bantuan                                           |");
            System.out.println("|2. Lihat Data Penerima Bantuan                                               |");
            System.out.println("|3. Hapus Data Penerima Bantuan                                               |");
            System.out.println("|4. Keluar dari Program                                                       |");
            System.out.println("===============================================================================");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tambahData();
                case 2 -> lihatData();
                case 3 -> hapusData();
                case 4 -> System.out.println("Terima kasih telah menggunakan layanan ini.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    static void tambahData() {
        System.out.println("\nPilih jenis bantuan:");
        System.out.println("1. BLT Reguler");
        System.out.println("2. BLT Khusus");
        System.out.print("Pilihan: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        if (jenis == 1) {
            System.out.print("Masukkan Jumlah Bantuan: ");
            double jumlah = input.nextDouble();
            input.nextLine();
            daftarPenerima.add(new PenerimaBLTReguler(nama, nik, alamat, jumlah));
        } else if (jenis == 2) {
            System.out.print("Masukkan Kategori Khusus (disabilitas/lansia/dll): ");
            String kategori = input.nextLine();
            daftarPenerima.add(new PenerimaBLTKhusus(nama, nik, alamat, kategori));
        } else {
            System.out.println("Jenis tidak valid.");
        }
    }

    static void lihatData() {
        System.out.println("\n== Daftar Penerima Bantuan ==");
        if (daftarPenerima.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            int i = 1;
            for (PenerimaBantuan p : daftarPenerima) {
                System.out.println("No. " + i++);
                p.tampilkanData();
            }
        }
    }

    static void hapusData() {
        lihatData();
        if (daftarPenerima.isEmpty()) return;

        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int index = input.nextInt();
        input.nextLine();

        if (index >= 1 && index <= daftarPenerima.size()) {
            daftarPenerima.remove(index - 1);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }
}
