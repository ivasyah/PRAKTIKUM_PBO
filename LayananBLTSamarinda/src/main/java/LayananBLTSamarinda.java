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
            System.out.println("|4. Edit Data Penerima Bantuan                                                |");
            System.out.println("|5. Keluar dari Program                                                       |");
            System.out.println("===============================================================================");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    hapusData();
                    break;
                case 4:
                    editData();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        PenerimaBantuan penerima = new PenerimaBantuan(nama, nik, alamat);
        daftarPenerima.add(penerima);
        System.out.println("Data berhasil ditambahkan.");
    }

    static void lihatData() {
        System.out.println("\n== Daftar Penerima Bantuan ==");
        if (daftarPenerima.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            int i = 1;
            for (PenerimaBantuan p : daftarPenerima) {
                System.out.println("No. " + i);
                p.tampilkanData();
                i++;
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

    static void editData() {
        lihatData();
        if (daftarPenerima.isEmpty()) return;

        System.out.print("Masukkan nomor data yang akan diedit: ");
        int index = input.nextInt();
        input.nextLine();

        if (index >= 1 && index <= daftarPenerima.size()) {
            PenerimaBantuan penerima = daftarPenerima.get(index - 1);

            System.out.println("Masukkan data baru (kosongkan jika tidak ingin mengubah):");
            System.out.print("Nama lama: " + penerima.getNama() + " | Nama baru: ");
            String namaBaru = input.nextLine();
            System.out.print("NIK lama: " + penerima.getNik() + " | NIK baru: ");
            String nikBaru = input.nextLine();
            System.out.print("Alamat lama: " + penerima.getAlamat() + " | Alamat baru: ");
            String alamatBaru = input.nextLine();

            if (!namaBaru.isEmpty()) penerima.setNama(namaBaru);
            if (!nikBaru.isEmpty()) penerima.setNik(nikBaru);
            if (!alamatBaru.isEmpty()) penerima.setAlamat(alamatBaru);

            System.out.println("Data berhasil diperbarui.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }
}
