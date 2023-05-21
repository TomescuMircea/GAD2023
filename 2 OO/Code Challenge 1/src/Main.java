public class Main {
    public static void main(String[] args) {
        Fighter fighter1=new Fighter("John",150,20);
        Fighter fighter2=new Fighter("George",130,15);
        BoxingMatch match=new BoxingMatch(fighter1,fighter2);
        System.out.println(match.fight());
    }
}