package ch2.pertemuan3;

import ch2.pertemuan3.studyCase.FoodItem;
import ch2.pertemuan3.studyCase.Order;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {

        Map<Object, Object> map = new HashMap();
        // ADD dengan map
        map.put("key1","value1");
        map.put("key2","value1");// key ga boleh duplikat : dia akann ngebaca key trakhir
        map.put("key3","value3"); // tipe data bisa apapun
        map.put("key4",123); // tipe data bisa apapun
        map.put("double",123.9); // tipe data bisa apapun

        FoodItem nasiGoreng = new FoodItem("Nasi Goreng", 25000);
        Order order=  new Order(nasiGoreng,10);
        map.put("order",order); // tipe data bisa apapun

        // Mencetak satu2, key
        System.out.println(map.get("key1"));
        System.out.println(map.get("key4"));
        System.out.println(map.get("order"));

        // Mencetak objek, key
        Order getOrderDetail = (Order) map.get("order");
        System.out.println(getOrderDetail.getOrderDetails());

        // remote KEY
        map.remove("key4");

        // VALUE DTO -> ga perlu report2 memebuat class, map
        // lingked hasmap
        Map mapLingked = new LinkedHashMap();
    }
}
