package Top4.Latihan;

import java.util.List;

public class KaryawanController {
    private KaryawanModel model;

    public KaryawanController(KaryawanModel model) {
        this.model = model;
    }

    public void tambahKaryawan(int id, String nama, String jabatan) {
        Karyawan karyawan = new Karyawan(id, nama, jabatan);
        model.tambahKaryawan(karyawan);
    }

    public void ubahKaryawan(int index, int id, String nama, String jabatan) {
        Karyawan karyawan = new Karyawan(id, nama, jabatan);
        model.ubahKaryawan(index, karyawan);
    }

    public void hapusKaryawan(int index) {
        model.hapusKaryawan(index);
    }

    public List<Karyawan> getKaryawanList() {
        return model.getKaryawanList();
    }
}
