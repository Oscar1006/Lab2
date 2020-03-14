package src.model;

public class Date {

    // Atributes
    private int month;
    private int day;
    private int year;

    // Methods
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
}