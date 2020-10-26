package week5.exerciseb;

public class Computer {
    private Case case_;
    private String monitor;
    private String motherboard;

    public Computer(Case case_, String monitor, String motherboard) {
        setCase_(case_);
        setMonitor(monitor);
        setMotherboard(motherboard);
    }

    public Case getCase_() {
        return case_;
    }

    public void setCase_(Case case_) {
        this.case_ = case_;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "Case Details:  " + getCase_() + "\nMonitor: " +getMonitor() + "\nMotherboard: " +getMotherboard();
    }
}
