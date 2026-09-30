/**
 * This program uses big numbers to compute the odds of winning the grand prize
 * in a lottery.
 */
void main() {
    IO.print("How many numbers do you need to draw? ");
    int k = Integer.parseInt(IO.readln());

    IO.print("What is the highest number you can draw? ");
    BigInteger n = new BigInteger(IO.readln());

    // Binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)

    BigInteger lotteryOdds = BigInteger.ONE;

    for (int i = 1; i <= k; i++)
        lotteryOdds = lotteryOdds
                .multiply(n.subtract(BigInteger.valueOf(i - 1)))
                .divide(BigInteger.valueOf(i));

    IO.println("Your odds are 1 in " + lotteryOdds + " Good luck!");
}
