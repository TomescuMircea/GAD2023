public class Main {

    public static Studio[] initData()
    {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        return studioDatabase;
    }

    public static void display(String[] names)
    {
        //System.out.println(names.length);
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);
        System.out.println("****");
    }

    public static String[] getAllStudiosNames1(Studio[] studioDatabase)
    {
        String[] names = new String[200];
        int k = 0;
        for (int i = 0; i < studioDatabase.length; i++) {
            if (studioDatabase[i].getFilme().length >= 2)
                names[k++] = studioDatabase[i].getNume();
        }

        String[] namesFinal = new String[k];
        for (int i = 0; i < k; i++)
            namesFinal[i] = names[i];
        return namesFinal;
    }

    public static String[] getAllStudiosNames2(Studio[] studioDatabase)
    {
        String[] names = new String[200];
        int no = 0;
        for (int i = 0; i < studioDatabase.length; i++) {
            boolean found = false;
            for (int j = 0; j < studioDatabase[i].getFilme().length && found == false; j++) {
                for (int k = 0; k < studioDatabase[i].getFilme()[j].getActori().length && found == false; k++) {
                    if (studioDatabase[i].getFilme()[j].getActori()[k].getNume() == "actor cu 2 oscaruri") {
                        names[no++] = studioDatabase[i].getNume();
                        found = true;
                    }
                }
            }
        }

        String[] namesFinal = new String[no];
        for (int i = 0; i < no; i++)
            namesFinal[i] = names[i];
        return namesFinal;
    }

    public static String[] getAllStudiosNames3(Studio[] studioDatabase)
    {
        String[] names = new String[200];
        int no = 0;
        for (int i = 0; i < studioDatabase.length; i++) {
            for (int j = 0; j < studioDatabase[i].getFilme().length; j++) {
                boolean found = false;
                for (int k = 0; k < studioDatabase[i].getFilme()[j].getActori().length && found == false; k++) {
                    if (studioDatabase[i].getFilme()[j].getActori()[k].getVarsta() >= 50) {
                        names[no++] = studioDatabase[i].getFilme()[j].getNume();
                        found = true;
                    }
                }
            }
        }

        String[] namesFinal = new String[no];
        for (int i = 0; i < no; i++)
            namesFinal[i] = names[i];
        return namesFinal;
    }

    public static void main(String args[])
    {
        Studio[] studioDatabase = initData();
        display(getAllStudiosNames1(studioDatabase));
        display(getAllStudiosNames2(studioDatabase));
        display(getAllStudiosNames3(studioDatabase));
    }
}
