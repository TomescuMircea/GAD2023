public class Actor {
    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = new Premiu[premii.length];
        for (int i = 0; i < premii.length; i++) {
            this.premii[i] = premii[i];
        }
    }

    public Integer getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public Premiu[] getPremii() {
        return premii;
    }
}
