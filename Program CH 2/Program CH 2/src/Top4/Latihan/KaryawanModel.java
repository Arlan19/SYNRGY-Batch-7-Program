package Top4.Latihan;

import java.util.ArrayList;
import java.util.List;

public class KaryawanModel {
    private List<Karyawan> karyawanList;

    public KaryawanModel() {
        this.karyawanList = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan karyawan) {
        karyawanList.add(karyawan);
    }

    public void ubahKaryawan(int index, Karyawan karyawan) {
        if (index >= 0 && index < karyawanList.size()) {
            karyawanList.set(index, karyawan);
        } else {
            throw new IndexOutOfBoundsException("Index di luar batas");
        }
    }

    public void hapusKaryawan(int index) {
        if (index >= 0 && index < karyawanList.size()) {
            karyawanList.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index di luar batas");
        }
    }

    public List<Karyawan> getKaryawanList() {
        return karyawanList;
    }
}
