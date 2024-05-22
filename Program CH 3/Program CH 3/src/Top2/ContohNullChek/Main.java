package Top2.ContohNullChek;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        if (student.getStudentId() == null){
            System.out.println("Data Student belum ada");
        } else if (student.getStudentId().equals("12345")){
            System.out.println("Student ini perlu dipanggil ke ruang BK");
        }
    }
}
