public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name,int health,int damagePerAttack)
    {
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    public int getHealth()
    {
        return health;
    }
    public int getDamagePerAttack()
    {
        return damagePerAttack;
    }
    public String getName()
    {
        return name;
    }
}
