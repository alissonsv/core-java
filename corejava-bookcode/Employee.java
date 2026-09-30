/**
 * A simplified employee class to demonstrate static fields and methods.
 * This class is used in StaticDemo.java and ParamDemo.java
 */
class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    Employee(String n, double s) {
        name = n;
        salary = s;
        id = advanceId();
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    int getId() {
        return id;
    }
    
    void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    static int advanceId() {
        int r = nextId; // obtain next available id
        nextId++;
        return r;
    }

    static void main() { // runs demo
        var e = new Employee("Harry", 50000);
        IO.println(e.getName() + " " + e.getSalary());
    }
}
