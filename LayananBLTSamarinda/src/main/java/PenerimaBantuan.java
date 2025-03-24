public class PenerimaBantuan {
    // Atribut private (Encapsulation)
    private String nama;
    private String nik;
    private String alamat;

    // Constructor
    public PenerimaBantuan(String nama, String nik, String alamat) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama   : " + getNama());
        System.out.println("NIK    : " + getNik());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("---------------------------");
    }
}
