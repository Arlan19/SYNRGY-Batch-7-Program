package ch1.pertemuan2;

public class MethodSample {
    public static void main(String[] args) {
        countTotalQty();
        System.out.println("Total QTY="+countTotalQty(12));
    }

    /*
    1. void -> tidak return nilai
    2. retur /type datea -> return nilai
     */
//    1. void -> tidak return nilai
    public static void countTotalQty(){
        System.out.println("QTY sudah di hitung");
    }

//     2. retur /type datea -> return nilai
    public static  Integer countTotalQty(Integer qty){
        return  0;
    }
}
