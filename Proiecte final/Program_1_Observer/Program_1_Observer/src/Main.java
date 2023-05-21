import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Subscriber> subscribers = new ArrayList<>();
        NewsFeed journal = new NewsFeed();
        journal.register(new Subscriber("Mihai"));
        journal.register(new Subscriber("Stefan"));

        journal.addArticle(new NewsArticle("Big fire","An entire street caught on fire last night."));
        journal.addArticle(new Jobs("Junior software development","We hire a new junior in our team. Salary 1000$."));
        journal.addArticle(new SportsArticle("5 titles in a row!","Manchester city won the league title."));
    }
}