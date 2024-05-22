package ch2.pertemuan1OOP.kelas;

import lombok.Data;

@Data
public class Mobil {

    private String roda;
    private String type;
    private Double kecepatan;

//    contoh dari cunstruktor
    public Mobil(){

    }

    //    contoh dari cunstruktor
    public Mobil(String roda){
        this.roda= roda;
    }

    //    contoh dari cunstruktor
    public Mobil(String roda,String type){
        this.roda= roda;
        this.type= type;
    }

    public Mobil(String roda, String type, double kecepatan) {
        this.roda = roda;
        this.type = type;
        this.kecepatan = kecepatan;
    }


    public static void kecepatan(){
        System.out.println("kecepatan di print");
    }

    public  Integer kecepatan(Double jarak, Integer waktu){
      return  (int) (jarak /waktu);
    }

    public  Double kecepatan(Double jarak, Integer waktu, String type){
        System.out.println("type ="+type);
        return  jarak/waktu;
    }

    public static void main(String[] args) {
        //Existing
        kecepatan();

        // Object Instance from class
        Mobil objName = new Mobil();
        objName.kecepatan();

        // Object COntructor
        Mobil objConstrukter = new Mobil("4");
//        objConstrukter.roda;

        // Object COntructor
        Mobil objConstrukterV2 = new Mobil("4","Avanza");

        // Object COntructor
        Mobil objConstrukterV3 = new Mobil("4","Avanza", 100.0);

    }

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

    public Double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(Double kecepatan) {
        this.kecepatan = kecepatan;
    }
}
