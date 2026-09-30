/**
 * This program demonstrates console input.
 */
void main() {
    // get first input
    String name = IO.readln("What is your name? ");

    // get second input
    int age = Integer.parseInt(IO.readln("How old are you? "));

    // display output on console
    IO.println("Hello, " + name + ". Next year, you'll be " + (age + 1) + ".");
}
