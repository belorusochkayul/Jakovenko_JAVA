import java.util.List;

public class Root {
    private String name;
    private String location;
    private List<News> news;

    public void setName(String name) {
        this.name = name;
    }

    public List<News> getNews() {
        return news;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", news=" + news +
                '}';
    }
}