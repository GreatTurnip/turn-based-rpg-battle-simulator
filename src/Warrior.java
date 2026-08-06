public class Warrior extends Character{
    public Warrior(String name)
    {
        super(name, 120, 30);
    }
    @Override
    public void attack(Character enemy)
    {
        enemy.takeDamage(getAttackDamage());
        System.out.println("%s swings his sword and hits %s for %d damage!".formatted(getName(),enemy.getName(),getAttackDamage()));
    }
}
