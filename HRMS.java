public class HRMS {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "IT", 60000);
        
        // Accessing data using getter methods
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());

        // Modifying salary safely using setter method
        emp1.setSalary(65000);
        System.out.println("Updated Salary: " + emp1.getSalary());

        // Manager Object (Child class)
        Manager mgr = new Manager("Alice Smith", 201, "HR", 80000, 5);
        mgr.approveLeave("John Doe", 3);
    }
}