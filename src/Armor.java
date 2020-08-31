public class Armor {
    private String name;
    private Double agility;
    private Double resistance;
    private Double hp;
    private Double expertise;
    private Double strength;

    public Armor(String name, Double agility, Double resistance, Double hp, Double expertise, Double strength) {
        this.agility = agility;
        this.name = name;
        this.expertise = expertise;
        this.hp = hp;
        this.strength = strength;
        this.resistance = resistance;
    }

    public String getArmorName() {
        return this.name;
    }

    public Double getArmorAgility() {
        return this.agility;
    }

    public Double getArmorStrength() {
        return this.strength;
    }

    public Double getArmorResistance() {
        return this.resistance;
    }

    public Double getArmorHp() {
        return this.hp;
    }

    public Double getArmorExpertise() {
        return this.expertise;
    }
}
