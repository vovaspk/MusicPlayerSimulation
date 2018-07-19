
public class Song {

    private String title;
    private double duraion;

    public Song(String title, double duraion) {
        this.title = title;
        this.duraion = duraion;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duraion=" + duraion +
                '}';
    }
}
