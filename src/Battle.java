public class Battle {
    public void start(Character a, Character b)
    {
        while(a.isAlive() & b.isAlive())
        {
            a.attack(b);
            if(!b.isAlive())
                break;
            b.attack(a);
        }
        if(a.isAlive()) System.out.println("%s wins!".formatted(a.getName()));
        else    System.out.println("%s wins!");
    }
}
