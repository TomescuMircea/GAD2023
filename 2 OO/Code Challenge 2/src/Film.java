public class Film {
    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = new Actor[actori.length];
        for (int i = 0; i < actori.length; i++) {
            this.actori[i] = actori[i];
        }
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }
}
