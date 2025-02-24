public class ElonsToyCar {
    private int distanceDriven = 0;
    private int batteryPercentage = 100;

    public ElonsToyCar() {
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceDriven);
    }

    public String batteryDisplay() {
        return String.format(batteryPercentage == 0 ? "Battery empty" : "Battery at %d%%", batteryPercentage);
    }

    public void drive() {
        if (batteryPercentage != 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }
}
