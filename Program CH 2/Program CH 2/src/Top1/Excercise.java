package Top1;

import java.text.SimpleDateFormat;
import java.util.Date;

class Employee {
    private int id;
    private String name;
    private Date dob;
    private String address;
    private boolean isActive;

    // Konstruktor untuk inisialisasi objek Employee
    public Employee(int id, String name, Date dob, String address, boolean isActive) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.isActive = isActive;
    }

    // Getter dan setter untuk semua atribut
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Metode untuk menampilkan detail karyawan
    public void displayDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String status = isActive ? "Aktif" : "Tidak Aktif";
        System.out.println("ID: " + id);
        System.out.println("Nama: " + name);
        System.out.println("Tanggal Lahir: " + dateFormat.format(dob));
        System.out.println("Alamat: " + address);
        System.out.println("Status: " + status);
    }
}

// Kelas untuk karyawan kontrak yang merupakan turunan dari kelas Employee
class ContractEmployee extends Employee {
    private int contractPeriod;

    // Konstruktor untuk inisialisasi objek ContractEmployee
    public ContractEmployee(int id, String name, Date dob, String address, boolean isActive, int contractPeriod) {
        super(id, name, dob, address, isActive);
        this.contractPeriod = contractPeriod;
    }

    // Getter dan setter untuk atribut contractPeriod
    public int getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(int contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    // Override metode displayDetails untuk menambahkan informasi khusus kontrak karyawan
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Masa Kontrak (bulan): " + contractPeriod);
    }
}

// Kelas utama yang berisi program pengelola data karyawan
public class Excercise {
    public static void main(String[] args) {
        // Membuat objek Date untuk menandakan tanggal lahir karyawan
        Date dob1 = new Date(90, 5, 15); // Contoh tanggal lahir (tahun, bulan, tanggal)
        Date dob2 = new Date(88, 10, 30);

        // Membuat objek karyawan
        Employee employee1 = new Employee(1, "John Doe", dob1, "Jl. ABC No. 123", true);
        ContractEmployee contractEmployee1 = new ContractEmployee(2, "Jane Smith", dob2, "Jl. XYZ No. 456", true, 12);

        // Menampilkan detail karyawan
        System.out.println("Detail Karyawan:");
        System.out.println("===============");
        employee1.displayDetails();
        System.out.println();
        contractEmployee1.displayDetails();
    }
}