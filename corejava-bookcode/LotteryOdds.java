/**
 * This program demonstrates a <code>for</code> loop.
 */
void main() {
    int k = Integer.parseInt(IO.readln("How many numbers do you need to draw? "));
    int n = Integer.parseInt(IO.readln("What is the highest number you can draw? "));

    // Binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)

    int lotteryOdds = 1;
    for (int i = 1; i <= k; i++)
        lotteryOdds = lotteryOdds * (n - i + 1) / i;

    IO.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
}
