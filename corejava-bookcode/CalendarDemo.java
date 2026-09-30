/**
 * This program prints a calendar for the current month.
 */
void main() {
    LocalDate date = LocalDate.now();
    int month = date.getMonthValue();
    int today = date.getDayOfMonth();

    date = date.minusDays(today - 1); // set to start of month
    DayOfWeek weekday = date.getDayOfWeek();
    int value = weekday.getValue(); // 1 = Monday, . . . , 7 = Sunday

    IO.println("Mon Tue Wed Thu Fri Sat Sun");
    for (int i = 1; i < value; i++) {
        IO.print("    ");
    }
    while (date.getMonthValue() == month) {
        IO.print("%3d".formatted(date.getDayOfMonth()));
        if (date.getDayOfMonth() == today) {
            IO.print("*");
        }
        else {
            IO.print(" ");
        }
        date = date.plusDays(1);
        if (date.getDayOfWeek().getValue() == 1) {
            IO.println();
        }
    }
    if (date.getDayOfWeek().getValue() != 1) {
        IO.println();
    }
}
