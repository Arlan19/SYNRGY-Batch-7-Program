package Top2.ContohNullPointerEx;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        if (student.getStudentId().equals("12345")){
            System.out.println("Student ini perlu dipanggil ke ruang BK");
        }
    }
}
