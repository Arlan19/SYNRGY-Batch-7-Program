package Top3.Exercise;

public class Main {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();

        // Adding employees
        controller.addEmployee(new Employee(1, "John Doe", "IT", 5000));
        controller.addEmployee(new Employee(2, "Jane Smith", "HR", 6000));
        controller.addEmployee(new Employee(3, "Michael Johnson", "Finance", 7000));

        // Displaying employees
        controller.displayEmployees();

        // Removing an employee
        controller.removeEmployee(new Employee(2, "Jane Smith", "HR", 6000));

        // Updating an employee
        controller.updateEmployee(new Employee(1, "John Doe", "IT", 5000),
                new Employee(1, "John Doe", "IT", 5500));

        System.out.println("Setelah Di Update");

        // Displaying employees after changes
        controller.displayEmployees();
    }
}
