package ch1.pertemuan4;

public class SwitchEx {
    public static void main(String[] args) {
       /*
       pengecekan grade kelulusan
        */
        String grade = "A";
        String hasil = null;
        switch (grade){
            case "A","B":
                hasil ="lulus";
                break;
            case "C":
                hasil ="tidak lulus";
                break;
            default:
                hasil ="tidak lulus";
                break;
        }
        System.out.println("result ="+hasil);
        chekGrade();
    }

    public  static  void chekGrade(){
        String grade = "A";
        String hasil = switch (grade) {
            case "A", "B" -> "lulus";
            case "C" -> "tidak lulus";
            default -> "tidak lulus";
        };
        System.out.println("result = " + hasil);
    }


}
