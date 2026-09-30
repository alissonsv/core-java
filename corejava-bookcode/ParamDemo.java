/**
 * This program demonstrates parameter passing in Java.
 */
void main() {
    /*
     * Test 1: Methods can't modify numeric parameters
     */
    IO.println("Testing tripleValue:");
    double percent = 10;
    IO.println("Before: percent=" + percent);
    tripleValue(percent);
    IO.println("After: percent=" + percent);

    /*
     * Test 2: Methods can change the state of object parameters
     */
    IO.println("\nTesting tripleSalary:");
    var harry = new Employee("Harry", 50000);
    IO.println("Before: salary=" + harry.getSalary());
    tripleSalary(harry);
    IO.println("After: salary=" + harry.getSalary());

    /*
     * Test 3: Methods can't attach new objects to object parameters
     */
    IO.println("\nTesting swap:");
    var a = new Employee("Alice", 70000);
    var b = new Employee("Bob", 60000);
    IO.println("Before: a=" + a.getName());
    IO.println("Before: b=" + b.getName());
    swap(a, b);
    IO.println("After: a=" + a.getName());
    IO.println("After: b=" + b.getName());
}

void tripleValue(double x) { // doesn't work
    x = 3 * x;
    IO.println("End of method: x=" + x);
}

void tripleSalary(Employee x) { // works
    x.raiseSalary(200);
    IO.println("End of method: salary=" + x.getSalary());
}

void swap(Employee x, Employee y) {
    Employee temp = x;
    x = y;
    y = temp;
    IO.println("End of method: x=" + x.getName());
    IO.println("End of method: y=" + y.getName());
}