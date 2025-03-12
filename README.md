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