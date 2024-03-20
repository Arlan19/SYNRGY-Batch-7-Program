package pertemuan2;

public class MethodSample {
    public static void main(String[] args) {
        countTotalQty();
        System.out.println("Total Qty : " + countTotalQty(12));
    }

    public static void countTotalQty(){
        System.out.println("Qty sudah dihitung");
    }

    public static Integer countTotalQty(Integer qty){
        return qty * 2;
    }

}
