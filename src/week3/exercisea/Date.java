package week3.exercisea;

public class Date {
    private int day;
    private int month;
    private int year;
    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 1990;
    }
    public Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Date object1){
        if(object1.getYear()==getYear() &&
           object1.getMonth()==getMonth() &&
           object1.getDay()==getDay())
            return true;
        else
            return false;
    }

    public Date copy(){
        Date temp = new Date();

        temp.setYear(getYear());
        temp.setMonth(getMonth());
        temp.setDay(getDay());

        return temp;
    }

    @Override
    public String toString() {
        return "\n\nDay: " + getDay() + "  Month: " + getMonth() + "  Year: " + getYear() + "\n\n";
    }
}
