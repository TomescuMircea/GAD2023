public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = new Film[filme.length];
        for (int i = 0; i < filme.length; i++) {
            this.filme[i] = filme[i];
        }
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }
}
