package Top3.Exercise;

import java.util.List;

public class EmployeeView {
    public void printEmployeeDetails(List<Employee> employees) {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("------------------------");
        }
    }
}
