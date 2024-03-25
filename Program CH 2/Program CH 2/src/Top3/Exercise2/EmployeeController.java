package Top3.Exercise2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeController {
    private List<Employee> employees;
    private EmployeeView employeeView;

    public EmployeeController() {
        this.employees = new ArrayList<>();
        this.employeeView = new EmployeeView();
    }

    public void addEmployee(int id, String name, Date dateOfBirth, String address, boolean isActive) {
        Employee employee = new Employee(id, name, dateOfBirth, address, isActive);
        employees.add(employee);
    }

    public void updateEmployee(int id, String name, Date dateOfBirth, String address, boolean isActive) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(name);
                employee.setDateOfBirth(dateOfBirth);
                employee.setAddress(address);
                employee.setActive(isActive);
                break;
            }
        }
    }

    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }

    public void displayEmployees() {
        employeeView.displayEmployees(employees);
    }
}
