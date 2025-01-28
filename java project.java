// Abstraction
abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Inheritance and Encapsulation
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing a team of " + teamSize + " employees.");
    }
}

// Polymorphism
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Developer("Alice", 101, 80000, "Java");
        employees[1] = new Manager("Bob", 102, 100000, 10);
        employees[2] = new Developer("Charlie", 103, 75000, "Python");

        for (Employee emp : employees) {
            emp.showDetails();
            emp.work();
            System.out.println("-------------------");
        }
    }
}
