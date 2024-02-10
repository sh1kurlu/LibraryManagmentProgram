package week03.datetime;

public class CustomDate {
    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Invalid date parameters.");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValidMonth(month)) {
            this.month = month;
        } else {
            System.out.println("Invalid month value.");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValidDay(day, month, year)) {
            this.day = day;
        } else {
            System.out.println("Invalid day value.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValidYear(year)) {
            this.year = year;
        } else {
            System.out.println("Invalid year value.");
        }
    }


    private boolean isValidDate(int month, int day, int year) {
        return isValidMonth(month) && isValidDay(day, month, year) && isValidYear(year);
    }

    private boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private boolean isValidDay(int day, int month, int year) {
        int maxDays = 31;
        if (isValidMonth(month)) {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    maxDays = 30;
                    break;
                case 2:
                    maxDays = (isLeapYear(year)) ? 29 : 28;
                    break;
            }
        }
        return day >= 1 && day <= maxDays;
    }

    private boolean isValidYear(int year) {
        return year >= 1;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
