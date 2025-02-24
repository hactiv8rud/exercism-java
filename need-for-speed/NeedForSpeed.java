class NeedForSpeed {
    public int distance = 0;
    public int batteryPercentage = 100;
    public int speed;
    public int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercentage >= batteryDrain ? false : true;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (batteryPercentage >= batteryDrain) {
            distance += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((float) distance / car.speed) * car.batteryDrain > 100 ? false : true;
    }
}
