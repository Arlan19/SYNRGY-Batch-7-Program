package Top4.Latihan2;

import java.util.List;

public class KaryawanView {
    public void tampilkanKaryawan(List<Karyawan> karyawanList){
        for(Karyawan karyawan : karyawanList){
            System.out.println(karyawan);
        }
    }
}
