package week5.exercisea;

public class TestClass {
    public static void main(String[] args) {
        Class class1 = new Class("Yoga For Beginners","Community Centre, Ballyheigue",22,new Time(19,30,0),new Time(20,45,0));
        Class class2 = new Class("Intermediate Zumba","Caherciveen S.S Spots Hall",18,new Time(18,45,0),new Time(19,30,0));
        Class class3 = new Class("Object Oriented Programming","S306",22,new Time(9,0,0),new Time(11,0,0));

        Class[] classes = new Class[]{class1,class2,class3};

        System.out.println("Displaying the state of the 3 Class objects at this point");
        int tempCounter = 1;
        for (Class CLASS : classes){
            System.out.println("\n\nClass " + tempCounter + "\n\n" + CLASS);
            tempCounter++;
        }

        System.out.println("\n\nTrying to change the start and finish times of the OOP class to dodgy values\n" +
                "of 11:60:-12 and -2:58:61 respectively");

        class3.setStartTime(new Time(11,60,-12));
        class3.setEndTime(new Time(-2,58,61));

        System.out.println("\n\nThe state of the OOP object is now \n\n" + class3 + "\n\n" +
                "Trying to change the start time of the Yoga class to 19:45:00 using a referenced" +
                "\nTime object called yogaStartTime");

        Time yogaStartTime = new Time(19,45,0);
        class1.setStartTime(yogaStartTime);

        System.out.println("\n\nThe Yoga Class is now" + class1 + "\n\nNow calling the getFinishTime()" +
                "of the Zumba class - this is being stored in a \nTime object called zumbaFinishTime\n\n" +
                "Now trying to alter the zumbaFinishTime object to 19:50:00");

        Time zumbaFinishTime = class2.getEndTime();
        zumbaFinishTime.setMinute(50);

        System.out.println("\n\nThe State of the zumbaFinishTime object is now " + zumbaFinishTime +
                "\n\nThe state of the Zumba class is now " + class2);
    }
}
