// Subclass (Manager) inherits from Employee
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int employeeId, String department, double salary, int teamSize) {
        super(name, employeeId, department, salary);
        this.teamSize = teamSize;
    }

    void approveLeave(String empName, int days) {
        System.out.println("Manager " + getName() + " approved " + days + " days leave for " + empName + ".");
    }
}