package Top4.Latihan2;

import java.util.Date;
import java.util.List;

public class KaryawanController {
    private KaryawanModel model;

    public KaryawanController(KaryawanModel model){
        this.model = model;
    }

    public void tambahKaryawan(int id, String nama, Date dateOfBirth, String alamat, boolean status){
        Karyawan karyawan = new Karyawan(id, nama, dateOfBirth, alamat, status);
        model.tambahKaryawan(karyawan);
    }

    public void ubahKaryawan(int index, int id, String nama, Date dateOfBirth, String alamat, boolean status){
        Karyawan karyawan = new Karyawan(id, nama, dateOfBirth, alamat, status);
        model.ubahKaryawan(index, karyawan);
    }

    public void hapusKaryawan(int index){
        model.hapusKaryawan(index);
    }

    public List<Karyawan> getKaryawanList(){
        return model.getKaryawanList();
    }
}
