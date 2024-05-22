package Top4.Latihan;

public class Main {
    public static void main(String[] args) {
        KaryawanModel model = new KaryawanModel();
        KaryawanController controller = new KaryawanController(model);
        KaryawanView view = new KaryawanView();

        // Menambahkan beberapa karyawan
        controller.tambahKaryawan(1, "John Doe", "Manager");
        controller.tambahKaryawan(2, "Jane Smith", "Staff");

        // Menampilkan daftar karyawan
        view.tampilkanKaryawan(controller.getKaryawanList());

        // Mengubah karyawan dengan ID 2
        controller.ubahKaryawan(1, 2, "Jane Smith", "Supervisor");

        // Menampilkan daftar karyawan setelah perubahan
        view.tampilkanKaryawan(controller.getKaryawanList());

        // Menghapus karyawan dengan ID 1
        controller.hapusKaryawan(0);

        // Menampilkan daftar karyawan setelah penghapusan
        view.tampilkanKaryawan(controller.getKaryawanList());
    }
}
