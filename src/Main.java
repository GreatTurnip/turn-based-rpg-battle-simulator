public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior("Arthur");
        Character mage = new Mage("Marlin");
        Character archer = new Archer("legolas");
        warrior.attack(mage);
        mage.attack(archer);
        archer.attack(warrior);
    }
}
