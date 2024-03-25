package Top3.Exercise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
    private List<Employee> employees;
    private EmployeeView employeeView;

    public EmployeeController() {
        employees = new ArrayList<>();
        employeeView = new EmployeeView();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
        int index = employees.indexOf(oldEmployee);
        employees.set(index + 1, newEmployee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void displayEmployees() {
        employeeView.printEmployeeDetails(employees);
    }
}
