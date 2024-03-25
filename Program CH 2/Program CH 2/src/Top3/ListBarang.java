package Top3;

import java.util.ArrayList;
import java.util.List;

public class ListBarang {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Kursi");
        list.add("Meja");
        list.add("Sofa");
        list.add("Lemari");

        var number = 1;
        System.out.println("Isi dari list ini adalah : ");
        for (String s : list){
            System.out.println(number + " " + s);
            number++;
        }

        for (int i=0; i <list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
