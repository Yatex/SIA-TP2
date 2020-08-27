public enum Profession {

    WARRIOR(0.6, 0.6),
    ARCHER(0.9, 0.1),
    DEFENSOR(0.3, 0.8),
    INFILTRATOR(0.8, 0.3);

    private final double professionAttack;
    private final double professionDefense;

    Profession(double professionAttack, double professionDefense) {
        this.professionAttack = professionAttack;
        this.professionDefense = professionDefense;
    }

    public double getProfessionAttack() {
        return professionAttack;
    }

    public double getProfessionDefense() {
        return professionDefense;
    }
}