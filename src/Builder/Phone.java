package Builder;

public class Phone {
    private String os,processor;
    private int ram,battery;
    private double screenSize;

    public Phone(String os, String processor, int ram, int battery, double screenSize) {
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.battery = battery;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                ", screenSize=" + screenSize +
                '}';
    }
}
