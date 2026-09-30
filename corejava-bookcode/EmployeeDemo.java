/**
 * This program tests the Employee class.
 */
void main() {
    // fill the staff array with three Employee objects
    Employee[] staff = new Employee[3];

    staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
    staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
    staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

    // raise everyone's salary by 5%
    for (Employee e : staff) {
        e.raiseSalary(5);
    }

    // print out information about all Employee objects
    for (Employee e : staff) {
        IO.println("name=" + e.getName() + ",salary=" + e.getSalary()
                + ",hireDay=" + e.getHireDay());
    }
}

/**
 * Variations of this class will be used throughout the book.
 */
class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    LocalDate getHireDay() {
        return hireDay;
    }

    void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
