interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {
    void displayAppliance() {
        System.out.println("Appliance: Smart TV");
    }

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

public class SmartHomeApplianceSystem {
    public static void main(String[] args) {
        Appliance a = new SmartTV();

        a.displayAppliance();

        RemoteControl r = (RemoteControl) a;
        r.turnOn();
        r.turnOff();
    }
}