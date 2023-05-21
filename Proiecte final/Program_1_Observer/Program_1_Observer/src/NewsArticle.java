public class NewsArticle extends Publication{
    private String title;
    private String description;
    public NewsArticle(String title,String description)
    {
        this.title=title;
        this.description=description;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
