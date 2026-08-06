public class Priest extends Character implements Healer{
    public Priest(String name)
    {
        super(name, 70, 10);
    }

    @Override
    public void attack(Character enemy)
    {
        enemy.takeDamage(getAttackDamage());
        System.out.println(getName() + " strikes with holy magic!");
    }

    @Override
    public void heal(Character target)
    {
        
    }
}
