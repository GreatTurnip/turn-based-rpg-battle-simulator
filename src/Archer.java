public class Archer extends Character{
    public Archer(String name)
    {
        super(name, 90, 35);
    }
    @Override
    public void attack(Character enemy)
    {
        enemy.takeDamage(getAttackDamage());
        System.out.println("%s shoots an arrow at %s for %d damage!"
            .formatted(getName(),enemy.getName(),getAttackDamage())
        );
    }
}
