package Pertemuan1;

public class Mobil {

    private String roda;
    private String type;
    private double kecepatan;

    public Mobil(){}

    public String getRoda() {
        return roda;
    }

    public void setRoda(String roda) {
        this.roda = roda;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public Mobil(String roda){
        this.roda = roda;

    }
    public Mobil(String roda, String type){
        this.roda = roda;
        this.type = type;
    }

//    contoh overloading
    public static void kecepatan(){
        System.out.println("ini kecepatan");
    }

    public Double kecepatan(Double jarak, Integer waktu){
        return jarak/waktu;
    }

    public Double kecepatan(Double jarak, Integer waktu, String type){
        System.out.println("type = " + type);
        return jarak/waktu;
    }
    public static void main(String[] args) {

        kecepatan();

        Mobil toyota = new Mobil("4");
        String jumlahRodaToyota = toyota.roda;
        System.out.println(jumlahRodaToyota);
    }
}
