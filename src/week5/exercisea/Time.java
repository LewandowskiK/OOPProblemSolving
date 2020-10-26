package week5.exercisea;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour>=0&&hour<=23)
            this.hour = hour;
        else
            this.hour = 0;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute>=0&&minute<=59)
            this.minute = minute;
        else
            this.minute = 0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second>=0&&second<=59)
            this.second = second;
        else
            this.second = 0;
    }

    @Override
    public String toString() {
        String output = "";

        if(getHour()>=10)
            output += getHour() + ":";
        else
            output += "0" + getHour() + ":";

        if(getMinute()>=10)
            output += getMinute() + ":";
        else
            output += "0" + getMinute() + ":";

        if(getSecond()>=10)
            output += getSecond();
        else
            output += "0" + getSecond();

        return output;
    }
}
