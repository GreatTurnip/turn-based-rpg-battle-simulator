public class Main {
    public static void main(String[] args) {
        Character hero = new Warrior("Arthur");
        Character enemy = new Mage("Marlin");
        Battle battle = new Battle();
        battle.start(hero, enemy);
    }
}
