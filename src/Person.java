
public class Person {

    private final Profession profession;
    private List<Armor> armorList; //no se si es mejor hacer los diferentes campos del cupero, y una clase armor con todos los tipos
    private final double height;

    public Person(double height, Profession profession, List<Armor> armorList) {
        this.height = height;
        this.profession = profession;
        this.armorList = armorList;
    }

    public double Performance() {
        return profession.getProfessionAttack() * Attack() + profession.getProfessionDefense() * Defense();
    }

    public double Attack() {
        return (getAgility() + getExpertise()) * getStrength() * getATM();
    }

    public double Defense() {
        return (getResistence() + getExpertise()) * getHP() * getDFM();
    }

    public double getAgility() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double agility = armorList.getItem().getAgility().sum(); // implementar
        return Math.tanh(0.01 * agility);
    }

    public double getExpertise() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double expertise = armorList.getItem().getExpertise().sum(); // same q antes, falta implementar
        return 0.6 * Math.tanh(0.01 * expertise);
    }

    public double getStrength() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double strength = armorList.getItem().getStrength().sum(); // ""
        return 100 * Math.tanh(0.01 * strength);
    }

    public double getResistence() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double resistance = armorList.getItem().getResistance().sum();
        return Math.tanh(0.01 * resistance);
    }

    public double getHP() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double hp = armorList.getItem().getHP().sum();
        return 100 * Math.tanh(0.01 * hp);
    }

    public double getATM() {
        return 0.7 - Math.pow(3 * height - 5, 4.0) + Math.pow(3 * height - 5, 2.0) + height / 4.0;
    }

    public double getDFM() {
        return 1.9 + Math.pow(2.5 * height - 4.16, 4.0) - Math.pow(2.5 * height - 4.16, 2.0) - 3.0 * height / 10.0;
    }
}