public abstract class Character {
    private String name;
    private int health;
    private int attackDamage;

    public Character(String name, int health,int attackDamage)
    {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }
    
    public abstract void attack(Character enemy);

    public int getHealth()
    {
        return health;
    }

    public String getName()
    {
        return name;
    }

    public void takeDamage(int damage)
    {
        health -= damage;
        if(health < 0)
            health = 0;
    }

    public int getAttackDamage()
    {
        return attackDamage;
    }

    public boolean isAlive()
    {
        return health > 0;
    }
}
