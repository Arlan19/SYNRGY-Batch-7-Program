package Top3.Exercise2;

import java.util.List;

public class EmployeeView {
    public void displayEmployees(List<Employee> employees) {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Date of Birth: " + employee.getDateOfBirth());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Status: " + (employee.isActive() ? "Active" : "Inactive"));
            System.out.println("------------------------");
        }
    }
}
