package ch2.pertemuan3;

import ch2.pertemuan3.studyCase.FoodItem;
import ch2.pertemuan3.studyCase.Order;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> objList = new ArrayList<>();
        // nambahin value ?
        objList.add("nasi goreng");
        objList.add("ayam goreng");
        objList.add("nasi goreng");
        objList.add("nasi goreng");
        objList.add("nasi goreng");

        //cetak result
        for(String  obj : objList){
            System.out.println(obj);
        }

        //penerapan dengan objekk
        FoodItem nasiGoreng = new FoodItem("Nasi Goreng", 25000);
        FoodItem mieGoreng = new FoodItem("Mie Goreng", 20000);

        Order order=  new Order(nasiGoreng,10);
        Order order2=  new Order(mieGoreng,10);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order);
        orderList.add(order2);
        orderList.add(order2);
        orderList.add(order2);
        for(Order  obj : orderList){
            System.out.println(obj.getOrderDetails());
        }


    }
}
