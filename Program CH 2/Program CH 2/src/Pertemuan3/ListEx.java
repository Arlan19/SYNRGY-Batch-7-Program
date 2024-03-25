package Pertemuan3;

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
    }
}
