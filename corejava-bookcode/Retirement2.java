/**
 * This program demonstrates a <code>do/while</code> loop.
 */
void main() {
    double payment = Double.parseDouble(
        IO.readln("How much money will you contribute every year? "));
    double interestRate = Double.parseDouble(IO.readln("Interest rate in %: "));

    double balance = 0;
    int year = 0;

    String input;

    // update account balance while user isn't ready to retire
    do {
        // add this year's payment and interest
        balance += payment;
        double interest = balance * interestRate / 100;
        balance += interest;

        year++;

        // print current balance
        IO.println("After year %d, your balance is %,.2f".formatted(year,
                balance));

        // ask if ready to retire and get input
        input = IO.readln("Ready to retire? (Y/N) ");
    }
    while (input.equals("N"));
}
