import java.util.Date;
import java.util.List;
import java.util.Objects;

public class News {

    private Date date;
    private String description;
    private int id;
    private List<String> keywords;
    private String title;
    private boolean visible;

    public News() {
    }

    public News(Date date, String description, int id, List<String> keywords, String title, boolean visible) {
        this.date = date;
        this.description = description;
        this.id = id;
        this.keywords = keywords;
        this.title = title;
        this.visible = visible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }


    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", keywords=" + keywords +
                ", visible=" + visible +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return date == news.date &&
                Objects.equals(id, news.id) && Objects.equals(title, news.title) && Objects.equals(description, news.description)
                && Objects.equals(keywords, news.keywords) && Objects.equals(visible, news.visible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, title, description, date, keywords, visible);
    }
}