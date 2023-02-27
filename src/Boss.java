public class Boss {
    private int HP;
    private int damage;
    private String typeDefence;

    public Boss(int HP, int damage, String typeDefence) {
        this.HP = HP;
        this.damage = damage;
        this.typeDefence = typeDefence;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeDefence() {
        return typeDefence;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }
}
