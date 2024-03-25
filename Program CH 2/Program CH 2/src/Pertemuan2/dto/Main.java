package Pertemuan2.dto;

public class Main {
    public static void main(String[] args) {
        Karyawan obj = new Karyawan();
        obj.setId(2);
        obj.setName("Toni");

        KaryawanDTO dto = new KaryawanDTO(obj.getName(),obj.id);
        System.out.println(dto);
    }
}
