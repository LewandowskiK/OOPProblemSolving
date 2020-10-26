package week4.execisea;

import java.util.Arrays;

public class Student {
    private String name;
    private int id;
    private static String college = "Institute of Technology, Tralee";
    private String department;
    private String[] modules;
    private static int count = 0;

    public Student(String name, String department, String[] modules) {
        setName(name);
        setId();
        setCollege(college);
        setDepartment(department);
        setModules(modules);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        count++;
        this.id = count;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nId: " + getId() + "\nCollege: " + getCollege()
                + "\nDepartment: " + getDepartment() + "\nModules: " + Arrays.toString(getModules());
    }
}
