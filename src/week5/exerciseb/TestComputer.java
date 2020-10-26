package week5.exerciseb;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer(new Case("Optiplex 7010","Dell",240,new Dimension(275,250,100)),"acer 5363","Asus 2345");
        Computer computer2 = new Computer(new Case("Optiplex GX620","Dell",230,new Dimension(315,300,120)),"LG 3241","Intel 6533");
        Computer computer3 = new Computer(new Case("i-Blason","Apple",115,new Dimension(250,275,110)),"HP5433","AMD1942");

        Computer[] computers = new Computer[]{computer1,computer2,computer3};

        System.out.println("Displaying the stater of the 3 Computer objects at this point");

        int tempCounter = 1;
        Computer[] optiplexPCs = new Computer[5];
        for (Computer computer : computers){
            System.out.println("\n\nComputer " + tempCounter + "\n\n" + computer);
            if(computer.getCase_().getModel().toLowerCase().contains("optiplex"))
                optiplexPCs[tempCounter] = computer;
            tempCounter++;
        }

        System.out.println("\n\nNow displaying a list of any Computer Objects whose case model includes the word \"Optiplex\"");

        for (Computer computer : optiplexPCs){
            if(computer!=null)
                System.out.println("\n" + computer);
        }
    }
}
