public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesHasBeenInOver) {
        return expectedMinutesInOven()-minutesHasBeenInOver;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayers, int minutesHasBeenInOven) {
        return preparationTimeInMinutes(numOfLayers) + minutesHasBeenInOven;
    }
}
