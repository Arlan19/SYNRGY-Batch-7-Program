package Top4.Latihan2;

import java.util.Date;

public class Karyawan {
    public int id;
    private String nama;
    private Date dateOfBirth;
    private String alamat;
    private boolean status;

    public Karyawan(int id, String nama, Date dateOfBirth, String alamat, boolean status){
        this.id = id;
        this.nama = nama;
        this.dateOfBirth = dateOfBirth;
        this.alamat = alamat;
        this.status = status;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString(){
        return "ID: " + id + ", Nama: " + nama + ", Tanggal Lahir: " + dateOfBirth + ", Alamat: " + alamat+ ", Status: " + status;
    }
}
