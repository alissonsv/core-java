import com.horstmann.corejava.Employee;
// the Employee class is defined in that package

/**
 * This program demonstrates the use of packages.
 */
void main() {
    // because of the import statement, we don't have to use
    // com.horstmann.corejava.Employee here
    var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

    harry.raiseSalary(5);

    // because of the static import statement, we don't have to use IO.println here
    IO.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
}
