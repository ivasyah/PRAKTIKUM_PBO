public final class PenerimaBLTKhusus extends PenerimaBantuan { // final class: tidak bisa diwariskan
    private String kategoriKhusus;

    public PenerimaBLTKhusus(String nik, String nama, String alamat, String kategoriKhusus) {
        super(nik, nama, alamat);
        this.kategoriKhusus = kategoriKhusus;
    }

    public String getKategoriKhusus() {
        return kategoriKhusus;
    }

    public void setKategoriKhusus(String kategoriKhusus) {
        this.kategoriKhusus = kategoriKhusus;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis   : BLT Khusus");
        System.out.println("Kategori: " + kategoriKhusus);
        System.out.println("---------------------------");
    }

    @Override
    public String getKategori() {
        return "Khusus - " + kategoriKhusus;
    }

    @Override
    public void tampilkanData(String header) {
        System.out.println("======================== " + header + " (Khusus)  ========================");
        super.tampilkanData(); // panggil method dari superclass
    }
}
