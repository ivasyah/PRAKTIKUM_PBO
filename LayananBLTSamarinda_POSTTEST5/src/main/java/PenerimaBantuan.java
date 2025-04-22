// Diubah jadi abstract class
public abstract class PenerimaBantuan {
    private final String nik; // Final attribute
    private String nama;
    private String alamat;

    public PenerimaBantuan(String nik, String nama, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Final method → tidak bisa dioverride oleh subclass
    public final void tampilkanHeader() {
    }

    public void tampilkanData() {
        tampilkanHeader();
        System.out.println("Nama   : " + nama);
        System.out.println("NIK    : " + nik);
        System.out.println("Alamat : " + alamat);
    }

    // Overloading (Polymorphism)
    public void tampilkanData(String header) {
        System.out.println("======== " + header + " ========");
        tampilkanData(); // panggil method yang sudah ada
        System.out.println("================================");
    }

    // Abstract method (wajib diimplementasi oleh subclass)
    public abstract String getKategori(); 
}
