import java.util.ArrayList;
import java.util.List;

public class NewsFeed implements Observable {
    private List<Publication> articles;
    private List<Observer> subsribers;

    public NewsFeed() {
        this.articles = new ArrayList<>();
        this.subsribers = new ArrayList<>();
    }

    public void addArticle(Publication newArticle) {
        articles.add(newArticle);
        this.notifyObservers(newArticle);
    }

    @Override
    public void register(Observer subscriber) {
        subsribers.add(subscriber);
    }

    @Override
    public void unregister(Observer subscriber) {
        subsribers.remove(subscriber);
    }

    @Override
    public void notifyObservers(Publication article) {
        for (Observer subscriber : subsribers){
            subscriber.read(article);
        }
    }
}
