public class Main {
    public static void main(String[] args) {
        Character hero = new Character("knight", 100, 20);
        Character monster = new Character("monster", 50, 10);
        hero.attack(monster);
        System.out.println(monster.getHealth());
        hero.attack(monster);
        System.out.println(monster.getHealth());
        if(monster.isAlive())
            System.out.println("%s is alive".formatted(monster.getName()));
        else
            System.out.println("%s is dead".formatted(monster.getName()));
    }
}
