public class PenerimaBLTKhusus extends PenerimaBantuan {
    private String kategoriKhusus;

    public PenerimaBLTKhusus(String nama, String nik, String alamat, String kategoriKhusus) {
        super(nama, nik, alamat);
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
        System.out.println("Jenis     : BLT Khusus");
        System.out.println("Kategori  : " + kategoriKhusus);
        System.out.println("---------------------------");
    }
}
