/**
 * This program shows how to store tabular data in a 2D array.
 */
void main() {
    final double STARTRATE = 5;
    final int NRATES = 6;
    final int NYEARS = 10;

    // set interest rates to 5 . . . 10%
    double[] interestRates = new double[NRATES];
    for (int j = 0; j < interestRates.length; j++)
        interestRates[j] = (STARTRATE + j) / 100.0;

    double[][] balances = new double[NYEARS][NRATES];

    // set initial balances to 10000
    for (int j = 0; j < balances[0].length; j++)
        balances[0][j] = 10000;

    // compute interest for future years
    for (int i = 1; i < balances.length; i++) {
        for (int j = 0; j < balances[i].length; j++) {
            // get last year's balances from previous row
            double oldBalance = balances[i - 1][j];

            // compute interest
            double interest = oldBalance * interestRates[j];

            // compute this year's balances
            balances[i][j] = oldBalance + interest;
        }
    }

    printTable(interestRates, balances);
}

void printTable(double[] headers, double[][] values) {
    for (double header : headers) {
        IO.print("%10.2f".formatted(header));
    }
    IO.println();
    IO.println("-".repeat(10 * headers.length));    
    // print balance table
    for (double[] row : values) {
        // print table row
        for (double value : row)
            IO.print("%10.2f".formatted(value));

        IO.println();
    }    
}
