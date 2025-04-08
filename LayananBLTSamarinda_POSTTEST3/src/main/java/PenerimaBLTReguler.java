public class PenerimaBLTReguler extends PenerimaBantuan {
    private double jumlahBantuan;

    public PenerimaBLTReguler(String nama, String nik, String alamat, double jumlahBantuan) {
        super(nama, nik, alamat);
        this.jumlahBantuan = jumlahBantuan;
    }

    public double getJumlahBantuan() {
        return jumlahBantuan;
    }

    public void setJumlahBantuan(double jumlahBantuan) {
        this.jumlahBantuan = jumlahBantuan;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis   : BLT Reguler");
        System.out.println("Jumlah  : Rp" + jumlahBantuan);
        System.out.println("---------------------------");
    }
}
