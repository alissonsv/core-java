/**
 * This program demonstrates static methods.
 */
void main(String[] args) {
    // fill the staff array with three Employee objects
    var staff = new Employee[3];

    staff[0] = new Employee("Tom", 40000);
    staff[1] = new Employee("Dick", 60000);
    staff[2] = new Employee("Harry", 65000);

    // print out information about all Employee objects
    for (Employee e : staff) {
        IO.println("name=" + e.getName() + ",id=" + e.getId()
                + ",salary=" + e.getSalary());
    }

    int n = Employee.advanceId(); // calls static method
    IO.println("Next issued id=" + n);
}