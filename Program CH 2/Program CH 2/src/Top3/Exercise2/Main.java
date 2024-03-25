package Top3.Exercise2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();

        // Adding employees
        controller.addEmployee(1, "John Doe", new Date(1990, 5, 15), "jalan guna karya", true);
        controller.addEmployee(2, "Jane Smith", new Date(1985, 8, 25), "perum bougenvile", false);
        controller.addEmployee(3, "Jack Ma", new Date(1975, 1, 1), "simp tabek gadang", true);

        // Displaying employees
        controller.displayEmployees();

        // Updating employee
        controller.updateEmployee(1, "John Doe Jr.", new Date(1990, 5, 15), "123 Main St", true);


        System.out.println("===================");
        System.out.println("=Setelah Di Update=");
        System.out.println("===================");

        // Displaying employees after update
        controller.displayEmployees();

        // Deleting an employee
        controller.deleteEmployee(2);


        System.out.println("===================");
        System.out.println("=Setelah Di Delete=");
        System.out.println("===================");
        // Displaying employees after deletion
        controller.displayEmployees();
    }
}
