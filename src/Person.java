import java.util.List;

public class Person {

    private final Profession profession;
    private List<Armor> armorList; //no se si es mejor hacer los diferentes campos del cuerpo, y una clase armor con todos los tipos
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
        return (getResistance() + getExpertise()) * getHP() * getDFM();
    }

    public double getAgility() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double agility = 0.0;
        for (int i = 0; i<5; i++){ // xq hay 5 items x player, no se xq lo veo dudoso esto
            agility = agility + armorList.get(i).getArmorAgility();
        }
        return Math.tanh(0.01 * agility);
    }

    public double getExpertise() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double expertise = 0.0;
        for( int i = 0; i < 5; i++) {
            expertise = expertise + armorList.get(i).getArmorExpertise();
        }
        return 0.6 * Math.tanh(0.01 * expertise);
    }

    public double getStrength() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double strength = 0.0;
        for( int i = 0; i < 5; i++) {
            strength = strength + armorList.get(i).getArmorStrength();
        }
        return 100 * Math.tanh(0.01 * strength);
    }

    public double getResistance() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double resistance = 0.0;
        for( int i = 0; i < 5; i++) {
            resistance = resistance + armorList.get(i).getArmorResistance();
        }
        return Math.tanh(0.01 * resistance);
    }

    public double getHP() {
        if (armorList == null) {
            throw new NullPointerException();
        }
        double hp = 0.0;
        for( int i = 0; i < 5; i++) {
            hp = hp + armorList.get(i).getArmorHp();
        }
        return 100 * Math.tanh(0.01 * hp);
    }

    public double getATM() {
        return 0.7 - Math.pow(3 * height - 5, 4.0) + Math.pow(3 * height - 5, 2.0) + height / 4.0;
    }

    public double getDFM() {
        return 1.9 + Math.pow(2.5 * height - 4.16, 4.0) - Math.pow(2.5 * height - 4.16, 2.0) - 3.0 * height / 10.0;
    }
}