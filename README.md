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


# Constructor
There name is same as the class name. They serve a special purpose of initializing the object.
Here is the example of the Syntax:
### Example
```java
MyClass myClassObj = new MyClass();
```
Now here, the method called after `new` keyword - `MyClass()`, is the constructor of this class.
This will help to instantiate the member data and methods and assign them to the object `myClassObj`.

### Types of Constructor
#### 1. Default Constructor (No-Argument Constructor):
- It does not take any parameters.
- It initializes objects with default values.
- If no constructor is defined, Java provides a default constructor implicitly.

##### Example:
```java
class ABC {
  int x;
  ABC() {
    x = 0;
  }
}
```

#### 2. Parameterized Constructor:
- It takes arguments to initialize object variables with specific values.
- Useful for setting custom values at the time of object creation.

##### Example:
```java
class ABC {
  int x;
  ABC(int y) {
    x = y;
  }
}
```

#### 3. Copy Constructor:
- It creates a new objects by copying values from another object of the same class.
- Java does not provide built-in copy constructor so we need to define it manually.

##### Example:
```java
class ABC {
  int x;
  ABC(int y) {
    x = y;
  }
  // Copy Constructor
  ABC(ABC abc) {
    x = abc.x;
  }
}
```

### Key Differences:
| Constructor Type       | Parameters | Purpose                    |
|------------------------|------------|----------------------------|
| Default Constructor | No | Initializes object with default values |
| Parameterized Constructor | Yes | Initializes object with specific values |
| Copy Constructor | Object as Parameter | Creates a new object by copying another object |


# Destructor
Contrary to constructors, which initialize objects and specify space for them.
Destructors are also special methods. But destructors free up the resources and memory occupied by an object. They are automatically called when an object is destroyed.


# Are class and structure same?
No, Class and Structure are not same. They look similar, but they have differences that make them apart.
For Example, the struct is saved in stack memory, whereas the class is saved in the heap memory.
Data Abstraction cannot be achieved with the help of Structures, but with class, Abstraction is majorly used.


# Explain Inheritence with example
Inheritence is one of the major feature of OOPS, by which an entity inherits some characteristics and behaviours of some other entity and makes them their own. Helps in code reuse.

Example: Let's take 3 person - Developer, Manager, HR. They are entirely different from one another with their own specific characteristics and behaviour. But in all three, you will find some common elements, like `empID`, `empName`, `empSalary`, etc. Though these elements are used by different persons, still they have their own features which are common among all the employee. This is achieved using Inheritence. The Developer, Manager, and the HR have all inherited the features like `empID`, `empName`, `empSalary`, etc. and used them as their own. Due to this they did not have to create these components from scratch. Facilitating CODE REUSE.

### Limitations:
With more powers comes more complications. It is very powerful but it has limitations too. It needs more time to process as it has to navigate through multiple class for its implementation. Also the class involved in inheritence, the base class and the child class, are very tightly coupled together. So if one needs to make some changes, they might need to do nested changes in both the classes. It is very complex in implementation, so if not correctly implemented then it can lead to unexpected errors or incorrect outputs.

### Types of Inheritence:
- Single Inheritence
- Multiple Inheritence
- Multi-level Inheritence
- Hierarchical Inheritence
- Hybrid Inheritence


# Interface
It refers to a special type of class, which contains methods, but not their defenition. Only the declaration of methods is allowed inside an interface. To use an interface, you cannot create objects. Instead, you need to implement that interface and define the methods of their implementation.

# Overloading and Overriding
Overloading is a compile-time polymorphism feature in which an entity has multiple implementation with the same name. For Example: Method Overloading or Operator Overloading.

Overriding is a runtime polymorphism in which an entity has the same name, but its implementation changes during execution. For Example: Method Overriding.

# How is data abstraction accompalished?
Data Abstraction is accompalished with the help of abstract methods or abstract classes.


# Abstract Class
Abstract Class is a special class containing abstract methods. The significance of abstract class is that the abstract method inside it are not implemented and only declared. So as a result, when a subclass inherits the abstract class and need to use its abstract methods, they need to define and implement them.


# Difference b/w Abstract class and Interface
Interface and Abstract class both are special types of classes that contain only the method declaration and not their implementation. But interface is entirely different from abstract class. The main difference between the two is that, when an interface is implemented, the subclass must define all its methods and provide its implementation. Whereas when abstract class is inherited, the subclass does not need to provide the definition of its abstract method, until and unless the subclass is using it.
Also, an abstract class can contain abstract methods as well as non-abstract methods.

# Exception
A special event which is raised during the execution of a program at runtime, that brings the execution to a halt. The reason for the expception is mainly due to a position in the program, where the user wants to do something for which the program is not specified, like undesirable input.


# Exception Handling
No one wants its Software to fail or crash. Exceptions are the major reasons for the software failure. The exceptions can be handled in the program beforehand and prevent the execution from stopping. This is known as exception handling.
`try-catch` is the most common method used for handling exceptions in the program.


# Garbage Collection
OOPS revolves around the entities like objects. Each object consumes memory and there can be multiple objects of a class. So if these objects and their memories are not handled properly, then it might lead to certain memory related errors and cause system failure.

Garbage collection refers to the mechanism of handling the memory in the program. Through garbage collection, the unwanted memory is freed up by removing the objects that are no longer needed.