public class Character {
    private String name;
    private int health;
    private int attackDamage;

    public Character(String name, int health,int attackDamage)
    {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }
    
    public void attack(Character enemy)
    {
        enemy.takeDamage(attackDamage);
        System.out.println("%s attacked %s for %d damage".formatted(name, enemy.name, attackDamage));
    }

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

    public boolean isAlive()
    {
        return health > 0;
    }
}
