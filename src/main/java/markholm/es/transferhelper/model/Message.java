package markholm.es.transferhelper.model;

import java.util.Date;

public class Message {
    private final long id;
    private final String title;
    private final String message;
    private final Date createdDate = new Date();

    public Message(String title, String message){
        String idBuilder = title + message;
        this.id = idBuilder.hashCode();
        this.title = title;
        this.message = message;
    }

    public Message(long id,  String title, String message){
        this.id = id;
        this.title = title;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
}
