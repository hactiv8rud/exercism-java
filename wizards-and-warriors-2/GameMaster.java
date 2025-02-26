public class GameMaster {

    public String describe(Character character) {
        return "You're a level " +
                character.getLevel() + " "+
                character.getCharacterClass() +
                " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " +
                destination.getName() + ", which has "+
                destination.getInhabitants() +
                " inhabitants.";
    }

    public String describe(TravelMethod travelMethod) {
        return "You're traveling to your destination " +
                (travelMethod.name() == "WALKING" ? "by " : "on ") +
                travelMethod.name().toLowerCase() +
                ".";
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return this.describe(character) + " " +
                this.describe(travelMethod) + " " +
                this.describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return this.describe(character) +
                " You're traveling to your destination by walking. " +
                this.describe(destination);
    }
}
