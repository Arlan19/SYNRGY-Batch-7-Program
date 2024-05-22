package Top4.Latihan2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        KaryawanModel model = new KaryawanModel();
        KaryawanController controller = new KaryawanController(model);
        KaryawanView view = new KaryawanView();

        controller.tambahKaryawan(1, "Jono", new Date(1990, 1, 12), "Jalan Sukajadi", true);
        controller.tambahKaryawan(2, "Smith", new Date(1993, 2, 18), "Jalan Jendral Soedirman", true);

        view.tampilkanKaryawan(controller.getKaryawanList());

        System.out.println("\nSetelah diupdate\n");

        controller.tambahKaryawan(3, "Jhon", new Date(1983, 9, 25), "Jalan Nangka", false);
        controller.ubahKaryawan(0, 1, "Jono", new Date(1990, 1, 12), "Jalan Sukajadi", false);

        view.tampilkanKaryawan(controller.getKaryawanList());

        System.out.println("\nSetelah dihapus\n");
        controller.hapusKaryawan(0);
        controller.hapusKaryawan(1);

        view.tampilkanKaryawan(controller.getKaryawanList());

    }
}
