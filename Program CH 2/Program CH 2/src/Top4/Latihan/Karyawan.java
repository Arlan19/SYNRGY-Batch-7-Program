package Top4.Latihan;

public class Karyawan {
    private int id;
    private String nama;
    private String jabatan;

    public Karyawan(int id, String nama, String jabatan) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
    }

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

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Jabatan: " + jabatan;
    }
}
