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

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public int difference(CustomDate date) {
        int daysInMonth = 30; 
        return (year - date.getYear()) * 12 * daysInMonth +
               (month - date.getMonth()) * daysInMonth +
               (day - date.getDay());
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year || (date1.year == date2.year && date1.month < date2.month) ||
                (date1.year == date2.year && date1.month == date2.month && date1.day < date2.day)) {
            return 1;
        } else if (date1.year > date2.year || (date1.year == date2.year && date1.month > date2.month) ||
                (date1.year == date2.year && date1.month == date2.month && date1.day > date2.day)) {
            return -1;
        } else {
            return 0;
        }
    }

    public void displayFormatted() {
        String[] monthAbbreviations = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(day + " " + monthAbbreviations[month] + " " + year);
    }

    
}
