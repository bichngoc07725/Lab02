import java.util.Scanner;

public class _64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int month = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a month (full name, abbreviation, or number): ");
            String monthInput = scanner.nextLine().trim();
            System.out.print("Enter a year (non-negative number): ");
            String yearInput = scanner.nextLine().trim();

            month = getMonthNumber(monthInput);
            year = getYearNumber(yearInput);

            if (month != -1 && year != -1) {
                validInput = true;
            } else {
                System.out.println("Invalid month or year. Please try again.");
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days: " + days);
    }

    private static int getMonthNumber(String monthInput) {
        switch (monthInput.toLowerCase()) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sep.":
            case "sep":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1;
        }
    }

    private static int getYearNumber(String yearInput) {
        try {
            int year = Integer.parseInt(yearInput);
            if (year >= 0) {
                return year;
            }
        } catch (NumberFormatException e) {
            // Invalid year input
        }
        return -1;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}