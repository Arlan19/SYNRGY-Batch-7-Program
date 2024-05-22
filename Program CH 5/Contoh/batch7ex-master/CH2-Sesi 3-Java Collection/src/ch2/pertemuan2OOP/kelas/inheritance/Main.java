package ch2.pertemuan2OOP.kelas.inheritance;

public class Main {
    public static void main(String[] args) {
        Mobil obj = new Mobil();
        System.out.println(obj.melaju("Avanza")); // call induknya , karena tidak ada method di class anak
        System.out.println(obj.melaju("Xenia",10)); // call anaknya karena dua2nya ada method dan param yang sama

       // bagaimana jika saya call mehtod overloading di subclass ?

      String getValue =  StaticAndFInal.URLUPLOADFILE;
    }
}
