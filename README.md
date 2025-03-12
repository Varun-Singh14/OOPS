# OOPS
It is a programming model which revolves around the concept of OBJECTS.
OBJECTS can be considered as real world entities like class, that contains some characteristics and behaviours specified in class template.

## CLASS
It is a blueprint or template, on the basis of which Objects are created.

## OBJECTS
It is called the instance of class that has some characteristics and behaviours.

## CHARACTERISTICS
It refers to "What" about the object.

## BEHAVIOURS
It refers to "How" about the Object.

### Example
```java
// Class Definition
class Employee {
    // Characteristics (Attributes)
    String name;
    int employeeId;
    String department;
    double salary;
    
    // Behavior (Methods)
    void work() {
        System.out.println(name + " is working in the " + department + " department.");
    }
    
    void applyLeave(int days) {
        System.out.println(name + " applied for " + days + " days leave.");
    }
}
```

## Note:
Object occupies space but a class does not.

# Main Features of OOPS
### Encapsulation
Process of binding data members and methods of a program together to do a specific job.
- **Data Hiding** → Process of hiding unwanted information.
- **Data Binding** →  Process of binding the data members and the methods together as a whole.
### Polymorphism
Process by which some code data methods behaves differently under different circumstances and contexts.
- **Compile Time Polymorphism** → (Static or Early Binding) Compiler decides what shape or value has to be taken by the entity in the picture.
- **Run Time Polymorphism** →  (Dynamic or Late Binding) Can't be decided by compiler, Therefore what shape or value has to be taken depends upon the execution.
### Inheritence
Mechanism by which an object or class *(referred to as child)* is created using the defenition of another object or class *(referred to as parent)*. Helps in code reuse.
### Abstraction 
Method of hiding unnecessary details from the necessary ones