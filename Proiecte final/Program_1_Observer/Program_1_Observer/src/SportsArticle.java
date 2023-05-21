public class SportsArticle extends Publication{
    private String title;
    private String description;
    public SportsArticle(String title,String description)
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
