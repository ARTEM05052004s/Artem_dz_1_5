public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss(700,50,"Magical");
        System.out.println("Boss");
        System.out.println("Health:  " + boss.getHP() + " Damage: " + boss.getDamage() + " Type Defence: " + boss.getTypeDefence());

    }
}