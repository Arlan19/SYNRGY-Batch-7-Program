package ch2.pertemuan3;

import ch2.pertemuan3.studyCase.FoodItem;
import ch2.pertemuan3.studyCase.Order;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        /*
        saya memiliki product name yang sama, nasi goreng, ayam goreng, nasi goreng
         */

        Set<String> names = new HashSet<>();
        names.add("nasi goreng");
        names.add("aldi");
        names.add("nasi goreng");

        for(String name : names){
            System.out.println(name);
        }

//======
        Set<Order> orderSet = new HashSet<>();
        FoodItem nasiGoreng = new FoodItem("Nasi Goreng", 25000);
        FoodItem mieGoreng = new FoodItem("Mie Goreng", 20000);

        Order order=  new Order(nasiGoreng,10);
        Order ordermieGoreng=  new Order(mieGoreng,10);
        orderSet.add(order);
        orderSet.add(order);
        orderSet.add(ordermieGoreng);
        orderSet.remove(ordermieGoreng); // delet

        for(Order orderValue : orderSet){
            System.out.println(orderValue.getOrderDetails());
        }




    }
}
