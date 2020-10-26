package week5.exercisea;

public class Class {
    private String name;
    private String location;
    private int enrollment;
    private Time startTime;
    private Time endTime;

    public Class(String name, String location, int enrollment, Time startTime, Time endTime) {
        setName(name);
        setLocation(location);
        setEnrollment(enrollment);
        setStartTime(startTime);
        setEndTime(endTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public Time getStartTime() {
        return new Time(startTime.getHour(),startTime.getMinute(),startTime.getSecond());
    }

    public void setStartTime(Time startTime) {
        this.startTime = new Time(startTime.getHour(),startTime.getMinute(),startTime.getSecond());
    }

    public Time getEndTime() {
        return new Time(endTime.getHour(),endTime.getMinute(),endTime.getSecond());
    }

    public void setEndTime(Time endTime) {
        this.endTime = new Time(endTime.getHour(),endTime.getMinute(),endTime.getSecond());
    }

    @Override
    public String toString() {

        return "Name: " + getName() + "\nLocation: " +getLocation() + "\nEnrollment: " + getEnrollment() +
                "\nStart Time:" + getStartTime() + "\nEnd Time: " + getEndTime();
    }
}
