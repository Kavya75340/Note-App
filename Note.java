import java.util.Date;

public class Note {
    private int id;
    private String title;
    private String content;
    private Date createdDate;
    private Date modifiedDate;

    public Note(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdDate = new Date();
        this.modifiedDate = new Date();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setTitle(String title) {
        this.title = title;
        this.modifiedDate = new Date(); // auto-update
    }

    public void setContent(String content) {
        this.content = content;
        this.modifiedDate = new Date(); // auto-update
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nTitle: " + title +
               "\nContent: " + content +
               "\nCreated: " + createdDate +
               "\nModified: " + modifiedDate;
    }
}
