package Top1;

import java.time.LocalDate;

class Karyawan {
    private int id;
    private String nama;
    private LocalDate dob;
    private String alamat;
    private boolean aktif;

    // Konstruktor
    public Karyawan(int id, String nama, LocalDate dob, String alamat, boolean aktif) {
        this.id = id;
        this.nama = nama;
        this.dob = dob;
        this.alamat = alamat;
        this.aktif = aktif;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    // Method untuk menampilkan informasi karyawan
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + dob);
        System.out.println("Alamat: " + alamat);
        System.out.println("Status: " + (aktif ? "Aktif" : "Tidak Aktif"));
    }
}

// Kelas turunan dari Karyawan, untuk jenis karyawan kontrak
class KaryawanKontrak extends Karyawan {
    private int durasiKontrak;

    // Konstruktor
    public KaryawanKontrak(int id, String nama, LocalDate dob, String alamat, boolean aktif, int durasiKontrak) {
        super(id, nama, dob, alamat, aktif);
        this.durasiKontrak = durasiKontrak;
    }

    // Getter dan Setter
    public int getDurasiKontrak() {
        return durasiKontrak;
    }

    public void setDurasiKontrak(int durasiKontrak) {
        this.durasiKontrak = durasiKontrak;
    }

    // Override method displayInfo untuk menampilkan informasi karyawan kontrak
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Durasi Kontrak: " + durasiKontrak + " bulan");
    }
}

public class Excercise2 {
    public static void main(String[] args) {
        // Membuat objek karyawan biasa
        Karyawan karyawanBiasa = new Karyawan(1, "John Doe", LocalDate.of(1990, 5, 15), "Jl. Raya No. 123", true);
        System.out.println("Informasi Karyawan Biasa:");
        karyawanBiasa.displayInfo();
        System.out.println();

        // Membuat objek karyawan kontrak
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak(2, "Jane Smith", LocalDate.of(1985, 8, 20), "Jl. Cendana No. 45", true, 12);
        System.out.println("Informasi Karyawan Kontrak:");
        karyawanKontrak.displayInfo();
    }
}
