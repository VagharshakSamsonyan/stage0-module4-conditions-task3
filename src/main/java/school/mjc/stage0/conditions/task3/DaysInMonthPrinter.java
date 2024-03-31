package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
            return;
        }

        int days;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 28; // Assuming non-leap year
                break;
            default:
                days = -1; // This shouldn't happen
                break;
        }

        System.out.println(days);
    }

    public static void main(String[] args) {
        DaysInMonthPrinter printer = new DaysInMonthPrinter();
        printer.amountOfDays(2); // Example usage
    }
}

