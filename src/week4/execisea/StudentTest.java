package week4.execisea;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Tim","Computing",new String[]{"Maths","Java","Networking Basics"});
        Student student2 = new Student("Ita","Social Care",new String[]{"Introduction to Social Care","Caring for the Elderly","Psychology"});
        Student student3 = new Student("Joe","Physics",new String[]{"Relativity","Mechanics","Hydrodynamics","Statistics","Quantum Mechanics"});

        Student[] students = new Student[]{student1,student2,student3};

        System.out.println("Total Students in College: " + Student.getCount() + "\n\n" +
                "Displaying the state of the 3 Student objects at this point\n");
        int tempCounter = 1;
        for (Student student:students) {
            System.out.println("\n\nStudent " + tempCounter + "\n\n" +  student.toString());
            tempCounter++;
        }
        Student.setCollege("Munster Technological University");
        System.out.println("\n\nCalling the static method setCollege() to alter the name of the " +
                "\ncollege to \"Munster Technological University\"");

        System.out.println("\n\nDisplaying the state of the " + Student.getCount() + " Student objects at this point\n");
        tempCounter = 1;
        for (Student student:students) {
            System.out.println("\n\nStudent " + tempCounter + "\n\n" +  student.toString());
            tempCounter++;
        }
    }
}
