
public class CarsAssemble {
    private int carsProducedPerHourAtSpeed1 = 221;
    public double productionRatePerHour(int speed) {
        double successRate;
        if (speed == 0) {
            successRate = 0;
        } else if (speed <= 4) {
            successRate = 1;
        } else if (speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else if (speed == 10) {
            successRate = 0.77;
        } else {
            throw new IllegalArgumentException("Invalid speed: " + speed);
        }
        return speed * carsProducedPerHourAtSpeed1 * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
