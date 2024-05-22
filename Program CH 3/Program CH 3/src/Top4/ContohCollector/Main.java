package Top4.ContohCollector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(11, "Joko", 22));
        studentList.add(new Student(22, "Tono", 18));
        studentList.add(new Student(33, "Asep", 22));

        Set<Student> students = studentList.stream().filter(s -> s.id > 18).collect(Collectors.toSet());
        for(Student student : students){
            System.out.println("ID: " + student.getId() + ", Nama: " + student.getName());
        }

        Double avgAge = studentList.stream().collect(Collectors.averagingInt(i -> i.age));
        System.out.println("Avarage age of student is : " + avgAge);



    }
}
