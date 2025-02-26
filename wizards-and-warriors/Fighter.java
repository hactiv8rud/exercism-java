class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    public boolean isVulnerable() { return false; }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    public String toString() { return "Fighter is a Warrior"; }
}

class Wizard extends Fighter {
    private boolean spellIsPrepared = false;

    @Override
    public boolean isVulnerable() { return spellIsPrepared ? false : true; }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return spellIsPrepared ? 12 : 3;
    }

    public String toString() { return "Fighter is a Wizard"; }

    public void prepareSpell() {
        spellIsPrepared = true;
    }
}
