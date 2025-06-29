public class AirCondition {

    private boolean isOn = false;
    private boolean isOff = true;
    private int temprature = 16;
    private int max_temp = 30;
    private int min_temp = 16;

    public void turnOn() {
        isOn = true;
        isOff = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
        isOff = true;
    }

    public boolean isOff() {
        return isOff;
    }

    public void incrementTemprature() {
        if (temprature < max_temp) {
            temprature++;
        }
    }

    public int getTemprature() {
        return temprature;
    }

    public int getTemperature() {
        return temprature;
    }

    public void decreaseTemprature() {
        if (temprature > min_temp) {
            temprature--;
        }
    }

    public void decreaseTemprature30() {
        if (temprature < min_temp) {
            temprature = min_temp;
        }
    }

    public static void main(String[] args) {
        AirCondition airCondition = new AirCondition();

        airCondition.turnOn();
        System.out.println("AC is on: " + airCondition.isOn());

        airCondition.turnOff();
        System.out.println("AC is off: " + airCondition.isOff());

        airCondition.turnOn(); // Turn it on again before changing temperature

        airCondition.incrementTemprature();
        System.out.println("The temperature increased: " + airCondition.getTemprature());

        airCondition.decreaseTemprature();
        System.out.println("The temperature decreased: " + airCondition.getTemprature());

        while (airCondition.getTemperature() < 30) {
            airCondition.incrementTemprature();
        }
        System.out.println("The temperature increased to max: " + airCondition.getTemprature());

        while (airCondition.getTemperature() > 16) {
            airCondition.decreaseTemprature();
        }
        System.out.println("The temperature decreased to min: " + airCondition.getTemprature());

        airCondition.decreaseTemprature();
        System.out.println("After trying to decrease below 16: " + airCondition.getTemprature());
    }
}
