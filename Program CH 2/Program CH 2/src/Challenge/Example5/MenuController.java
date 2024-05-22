package Challenge.Example5;

import java.util.HashMap;

public class MenuController {
    private HashMap<Integer, MenuItem> menuItems;

    public MenuController(){
        menuItems = new HashMap<>();
        menuItems.put(1, new MenuItem("Nasi Goreng", 15000));
        menuItems.put(2, new MenuItem("Mie Goreng", 13000));
        menuItems.put(3, new MenuItem("Nasi + Ayam", 18000));
        menuItems.put(4, new MenuItem("Es Teh Manis", 3000));
        menuItems.put(5, new MenuItem("Es Jeruk", 5000));
    }

    public HashMap<Integer, MenuItem> getMenuItems() {
        return menuItems;
    }
}
