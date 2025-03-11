// Class Definition
abstract class Employee {
    // Characteristics (Attributes)
    private String name;
    private int employeeId;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    // Getters (Read data)
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setters (Modify data safely)
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
    
    // Behavior (Methods)
    void work() {
        System.out.println(getName() + " is working in the " + getDepartment() + " department.");
    }
    
    void applyLeave(int days) {
        System.out.println(name + " applied for " + days + " days leave.");
    }

    // Abstract method (Implemented in subclasses)
    abstract void calculateSalary();
}

// Subclass: Developer
class Developer extends Employee {
    public Developer(String name, int employeeId, String department, double salary) {
        super(name, employeeId, department, salary);
    }

    // Overriding work() method
    @Override
    void work() {
        System.out.println(getName() + " is coding in " + getDepartment() + " department.");
    }
}

// Subclass: HR
class HR extends Employee {
    public HR(String name, int employeeId, String department, double salary) {
        super(name, employeeId, department, salary);
    }

    // Overriding work() method
    @Override
    void work() {
        System.out.println(getName() + " is managing employees.");
    }

    @Override
    void calculateSalary() {
        System.out.println(getName() + "'s salary: $" + fixedSalary);
    }
}