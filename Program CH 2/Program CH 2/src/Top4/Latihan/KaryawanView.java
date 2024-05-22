package Top4.Latihan;

import java.util.List;

public class KaryawanView {
    public void tampilkanKaryawan(List<Karyawan> karyawanList) {
        for (Karyawan karyawan : karyawanList) {
            System.out.println(karyawan);
        }
    }
}
