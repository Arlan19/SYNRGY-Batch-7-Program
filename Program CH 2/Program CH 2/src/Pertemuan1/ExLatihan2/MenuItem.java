package Pertemuan1.ExLatihan2;

public class MenuItem {
    private String namaMenu;
    private Integer harga;

    public MenuItem(){}

    public MenuItem(String namaMenu, Integer harga){
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }
}
