package ch2.pertemuan2OOP.kelas.dto;

public class Main {

    public static void main(String[] args) {
        Karyawan obj1= new Karyawan();
        obj1.setId(1);
        obj1.setName("karyawan");
        //tranfer ke objek DTO

        KaryawanDTO dto = new KaryawanDTO(obj1.getId(), obj1.getName());
        System.out.println(dto);
    }
}
