public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;
    public BoxingMatch(Fighter fighter1,Fighter fighter2)
    {
        this.fighter1=fighter1;
        this.fighter2=fighter2;
    }
    public String fight()
    {
        int health1=fighter1.getHealth();
        int health2=fighter2.getHealth();
        int round=1;
        while(health1>0 && health2>0)
        {
            if(round%2==1)
            {
                health1=health1-fighter2.getDamagePerAttack();
            }
            else {
                health2=health2-fighter2.getDamagePerAttack();
            }
            round++;
        }
        if(health1<0)
        {
            return fighter2.getName();
        }
        else
        {
            return fighter1.getName();
        }
    }
}
