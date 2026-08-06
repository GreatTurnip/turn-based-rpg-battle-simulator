public class Mage extends Character{
    public Mage(String name)
    {
        super(name, 80, 45);
    }
    @Override
    public void attack(Character enemy)
    {
        enemy.takeDamage(getAttackDamage());
        System.out.println("%s casts fireball at %s for %d damage!".formatted(getName(),enemy.getName(),getAttackDamage()));
    }
}
